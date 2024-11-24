package org.Good_Care_HospitalMS.controller;

import java.util.List;

import org.Good_Care_HospitalMS.entity.Patient;
import org.Good_Care_HospitalMS.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;

@GetMapping("list")
public List<Patient> getAllPatien()
	{
		return patientRepository.findAll();
	}
}
