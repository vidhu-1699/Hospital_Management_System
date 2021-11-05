package com.example.PatientEnroll.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PatientEnroll.model.Patient;
import com.example.PatientEnroll.model.PatientDiagnosis;
import com.example.PatientEnroll.repository.PatientDiagnosisRepository;
import com.example.PatientEnroll.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService  {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	PatientDiagnosisRepository patientDiagnosisRepository;

	//@Override
	//public Patient enrollPatient(Patient patient) {
		// TODO Auto-generated method stub
		//return patientRepository.save(patient);
	//}

	//@Override
	//public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		//return patientRepository.save(patient);
	//}

	//@Override
	//public boolean deletePatient(int patientId) {
		// TODO Auto-generated method stub
		 //patientRepository.deleteById(patientId); 
		 //return true;
	//}

	//@Override
	//public List getPatientDiagnosisByPatientId(int patientId) {
		// TODO Auto-generated method stub
		//return patientDiagnosisRepository.findAllByPatientId(patientId);
	//}

	@Override
	public PatientDiagnosis enrollPatientDiagnosis(PatientDiagnosis patientDiagnosis) {
		// TODO Auto-generated method stub
		return patientDiagnosisRepository.save(patientDiagnosis);
	}

	//@Override
	//public List getPatient() {
		// TODO Auto-generated method stub
		//return patientRepository.findAll();
	//}


	

}
