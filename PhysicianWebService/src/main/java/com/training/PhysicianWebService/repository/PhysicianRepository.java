package com.training.PhysicianWebService.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.PhysicianWebService.model.Physician;


public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

	public List<Physician> findAllByState(String state);
	public List<Physician> findAllByDepartment(String department);
	public List<Physician> findAllByInsurancePlan(String insurancePlan);
}
