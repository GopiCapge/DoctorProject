package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Doctor;
import com.crud.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	@GetMapping("/doctors")
	public ResponseEntity<List<Doctor>>getAllDoctor(){
		return ResponseEntity.ok().body(doctorService.getAllDoctor());
		
	}
	

	@GetMapping("/doctors/{id}")
	public ResponseEntity<Doctor>getDoctorById(@PathVariable int id){
		return ResponseEntity.ok().body(doctorService.getDoctorById(id));
		
	}
	
	
	@PostMapping("/doctors")
	public ResponseEntity<Doctor>createDoctor(@RequestBody Doctor doctor){
		return ResponseEntity.ok().body(this.doctorService.createDoctor(doctor));
		 
		
	}
	@PutMapping("/doctors/{id}")
	public ResponseEntity<Doctor>updateDoctor(@PathVariable int id,@RequestBody Doctor doctor){
		doctor.setId(id);
		
		return ResponseEntity.ok().body(this.doctorService.updateDoctor(doctor));
		 
	}
	@DeleteMapping("/doctors/{id}")
	public ResponseEntity<?>deleteDoctor(@PathVariable int id){
		this.doctorService.deleteDoctor(id);
		return (ResponseEntity<?>)ResponseEntity.status(HttpStatus.OK);
	}
	
}
