package com.training.PhysicianWebService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.PhysicianWebService.model.Physician;
import com.training.PhysicianWebService.repository.PhysicianRepository;


@Service
public class PhysicianServiceImpl implements PhysicianService {

	@Autowired
	PhysicianRepository physicianRepository;

	@Override
	public Physician enrollPhysician(Physician physician) {

		return physicianRepository.save(physician);
	}

	@Override
	public Physician updatePhysician(Physician physician) {

		return physicianRepository.save(physician);
	}

	@Override
	public boolean deletePhysician(int physicianId) {

		physicianRepository.deleteById(physicianId);
		return true;
	}

	@Override
	public List<Physician> findall() {
		return physicianRepository.findAll();
	}

	@Override
	public List<Physician> findAllByState(String state) {
		
		return physicianRepository.findAllByState(state);
	}

	@Override
	public List<Physician> findAllByDepartment(String department) {
		
		return physicianRepository.findAllByDepartment(department);
	}

	@Override
	public List<Physician> findAllByInsurancePlan(String insurancePlan) {
		
		return physicianRepository.findAllByInsurancePlan(insurancePlan);
	}



}
