package com.amrib.admservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amrib.admservice.model.Patient;

@RestController
@RequestMapping(value = "/v1")
public class AdmissionController {

	private List<Patient> patients = Arrays
			.asList(new Patient("1", "Butin", "Jean", "145123545487874", "Français", false));

	@GetMapping(value = "/admission")
	public List<Patient> getPatients() {
		return patients;
	}

	@GetMapping(value = "/admission/{id}")
	public Patient getPatientById(@PathVariable("id") String id) {
		return patients.stream().filter(patient -> patient.getId().equals(id)).findAny().orElse(null);
	}

}
