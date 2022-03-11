package com.crud.service;

import java.util.List;

import com.crud.model.Doctor;

public interface DoctorService {
	
	Doctor createDoctor(Doctor doctor);
	Doctor updateDoctor(Doctor doctor);
	List<Doctor> getAllDoctor();
	Doctor getDoctorById(int id);
	void deleteDoctor(int id);
	
	
	

}
