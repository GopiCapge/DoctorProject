package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@Column(name ="doctorname")
private String doctorname;

@Column(name ="degree")
private String degree;

@Column(name ="specification")
private String specification;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDoctorname() {
	return doctorname;
}
public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
public String getSpecification() {
	return specification;
}
public void setSpecification(String specification) {
	this.specification = specification;
}


}
