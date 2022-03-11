package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
