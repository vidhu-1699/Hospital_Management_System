package com.example.PatientEnroll.service;


import java.util.List;
import java.util.Optional;

import com.example.PatientEnroll.model.Patient;
import com.example.PatientEnroll.model.PatientDiagnosis;

public interface PatientService {

	//public Patient enrollPatient(Patient patient);

   //public Patient updatePatient(Patient patient);

	//public boolean deletePatient(int id);

	//public List getPatientDiagnosisByPatientId(int patientId );

	public PatientDiagnosis enrollPatientDiagnosis(PatientDiagnosis patientDiagnosis);

	//public List getPatient();



}
