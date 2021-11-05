package com.example.PatientEnroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.PatientEnroll.model.Patient;
import com.example.PatientEnroll.model.PatientDiagnosis;
import com.example.PatientEnroll.service.PatientService;

@RestController
@Controller
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	
	
		//@PostMapping("enrollPatient")
		//public ResponseEntity<Patient> enrollPatient(@RequestBody Patient patient)
		//{
			//return new ResponseEntity<Patient>(patientService.enrollPatient(patient),HttpStatus.OK);
		
		//}
		//@PutMapping("updatePatient")
		//public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient)
		////{
			//return new ResponseEntity<Patient>(patientService.updatePatient(patient),HttpStatus.OK);
			
		//}
		//@DeleteMapping("deletePatient")
		//public boolean deletePatient(@RequestBody @RequestParam int patientId)
		//{
			//patientService.deletePatient(patientId);
			//return true;
			
		//}
		//PostMapping("enrollPatientDiagnosis")
		
		@PostMapping("enrollPatientDiagnosis")
		public String enrollPatientDiagnosis(@RequestBody PatientDiagnosis patientDiagnosis)
		{   
			
			patientService.enrollPatientDiagnosis(patientDiagnosis);
			return "success";
		
		}
		
		//@GetMapping("patientDiagnosisByPatientId")
		//public ResponseEntity<List> getPatientDiagnosis( @RequestParam int patientId)
		//{
			//return new ResponseEntity<List>(patientService.getPatientDiagnosisByPatientId(patientId),HttpStatus.OK);
			
		//}
		//@GetMapping("getPatient")
		//public ResponseEntity<List> getPatient()
		//{
			//return new ResponseEntity<List>(patientService.getPatient(),HttpStatus.OK);
			
		//}
		
}
