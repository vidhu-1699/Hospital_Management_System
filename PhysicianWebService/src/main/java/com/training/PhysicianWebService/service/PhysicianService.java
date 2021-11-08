package com.training.PhysicianWebService.service;


import java.util.List;

import com.training.PhysicianWebService.model.Physician;


public interface PhysicianService {

	public Physician enrollPhysician(Physician physician);

	public Physician updatePhysician(Physician physician);

	public boolean deletePhysician(int physicianId);
	
	public List<Physician> findall();
	
	public List<Physician> findAllByState(String state);
	
	public List<Physician> findAllByDepartment(String department);
	
	public List<Physician> findAllByInsurancePlan(String insurancePlan);
	//public List getPatientDiagnosisByPatientId(int physicianId);

}
