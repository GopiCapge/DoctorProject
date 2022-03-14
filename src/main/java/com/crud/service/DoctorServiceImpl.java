package com.crud.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.exception.ResourseNotFoundException;
import com.crud.model.Doctor;
import com.crud.repository.DoctorRepository;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    
    
	@Override
	public Doctor createDoctor(Doctor doctor) {
		
		return doctorRepository.save(doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		Optional<Doctor>doctorDb=this.doctorRepository.findById(doctor.getId());
		
		if(doctorDb.isPresent()) {
			Doctor doctorUpdate=doctorDb.get();
			doctorUpdate.setId(doctor.getId());
			doctorUpdate.setDoctorname(doctor.getDoctorname());
			doctorUpdate.setDegree(doctor.getDegree());
			doctorUpdate.setSpecification(doctor.getSpecification());
			doctorRepository.save(doctorUpdate);
			return doctorUpdate;
			}
		else {
			throw new ResourseNotFoundException("Record not found with id :"+doctor.getId());
		}
	}

	@Override
	public List<Doctor> getAllDoctor() {
		
		return this.doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(int id) {
		
		Optional<Doctor>doctorDb=this.doctorRepository.findById(id);
		if(doctorDb.isPresent()) {
		return doctorDb.get();
		}
		else
		{
			throw new ResourseNotFoundException("Record not found with id :"+id);
		}
	}

	@Override
	public void deleteDoctor(int id) {
		Optional<Doctor>doctorDb=this.doctorRepository.findById(id);
		if(doctorDb.isPresent()) {
		this.doctorRepository.delete(doctorDb.get());
		}
		else
		{
			throw new ResourseNotFoundException("Record not found with id :"+id);
		}
		
	}
	

}
