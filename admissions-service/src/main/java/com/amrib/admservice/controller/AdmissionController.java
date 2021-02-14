package com.amrib.admservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amrib.admservice.model.Employe;
import com.amrib.admservice.model.EmployeeList;
import com.amrib.admservice.model.Patient;

@RestController
@RequestMapping(value = "/api/v1")
public class AdmissionController {

	@Autowired
	private RestTemplate restTemplate;

	private List<Patient> patients = Arrays.asList(
			new Patient("1", "Butin", "Jean", "145123545487874", "Française", false),
			new Patient("2", "Merit", "Marc", "523652445896522", "Belge", true),
			new Patient("3", "Oglu", "Brad", "654789523332155", "Americaine", true),
			new Patient("4", "Bachir", "Wael", "987563214532522", "Libanese", false));

	@GetMapping(value = "/admission")
	public List<Patient> getPatients() {
		return patients;
	}

	@GetMapping(value = "/admission/doctors")
	public EmployeeList getDoctors() {
		return restTemplate.getForObject("http://localhost:8082/api/v1/employees", EmployeeList.class);
	}

	@GetMapping(value = "/admission/{id}")
	public Patient getPatientById(@PathVariable("id") String id) {
		return patients.stream().filter(patient -> patient.getId().equals(id)).findAny().orElse(null);
	}

}
