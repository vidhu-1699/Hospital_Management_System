package com.example.PatientEnroll.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PatientEnroll.model.PatientDiagnosis;

@Repository
public interface PatientDiagnosisRepository extends JpaRepository<PatientDiagnosis,Integer> {


	//List<PatientDiagnosis> findAllByPatientId(int patientId);

}
