package com.training.PhysicianWebService.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.PhysicianWebService.model.Physician;
import com.training.PhysicianWebService.service.PhysicianService;

@RestController
public class PhysicianController {

	@Autowired
	PhysicianService physicianService;

	@GetMapping("/physicians")
	public ResponseEntity<List> physicians() {
		return new ResponseEntity<List>(physicianService.findall(), HttpStatus.OK);

	}

	@PostMapping("enrollPhysician")
	public ResponseEntity<Physician> enrollPhysician(@RequestBody Physician physician) {
		return new ResponseEntity<Physician>(physicianService.enrollPhysician(physician), HttpStatus.OK);
	}

	@PutMapping("updatePhysician")
	public ResponseEntity<Physician> updatePhysician(@RequestBody Physician physician) {
		return new ResponseEntity<Physician>(physicianService.updatePhysician(physician), HttpStatus.OK);

	}

	@DeleteMapping("/deletePhysician")
	public ResponseEntity<String> deletePhysician(@RequestParam int physicianId) {
		physicianService.deletePhysician(physicianId);
		return new ResponseEntity<String>("Succesfully deleted", HttpStatus.OK);

	}

	@GetMapping("/physiciansByState")
	public ResponseEntity<List> physicianState(@RequestParam String state) {
		return new ResponseEntity<List>(physicianService.findAllByState(state), HttpStatus.OK);

	}

	@GetMapping("/physiciansByDepartment")
	public ResponseEntity<List> physicianDepartment(@RequestParam String department) {
		return new ResponseEntity<List>(physicianService.findAllByDepartment(department), HttpStatus.OK);
	}

	@GetMapping("/physiciansByPlan")
	public ResponseEntity<List> physicianPlan(@RequestParam String insurancePlan) {
		return new ResponseEntity<List>(physicianService.findAllByInsurancePlan(insurancePlan), HttpStatus.OK);

	}

}
