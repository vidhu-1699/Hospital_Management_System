package com.example.PatientEnroll.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PatientEnroll.model.Patient;

@Repository
public interface PatientRepository  extends JpaRepository<Patient,Integer>{

	List findByPatientId(int patientId);

	

}
