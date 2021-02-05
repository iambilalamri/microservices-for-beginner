package com.amrib.admservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amrib.admservice.model.Patient;

@RestController
public class AdmissionController {

	private List<Patient> patients = Arrays
			.asList(new Patient("1", "Butin", "Jean", "145123545487874", "Français", false));

	public List<Patient> getPatients() {
		return patients;
	}

	public Patient getPatientById(@PathVariable("id") String id) {
		return patients.stream().filter(patient -> patient.getId().equals(id)).findAny().orElse(null);
	}

}
