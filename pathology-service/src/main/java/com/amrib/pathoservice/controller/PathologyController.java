package com.amrib.pathoservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amrib.pathoservice.model.Disease;

@RestController
@RequestMapping(value = "/api/v1")
public class PathologyController {

	List<Disease> diseases = Arrays.asList(new Disease("1", "Ashma", "description", "Warm water bath"),
			new Disease("2", "Ashma", "description", "Warm water bath"),
			new Disease("3", "Ashma", "description", "Warm water bath"),
			new Disease("4", "Ashma", "description", "Warm water bath"),
			new Disease("5", "Ashma", "description", "Warm water bath"));

	@GetMapping(value = "/diseases")
	public List<Disease> getDiseases() {
		return diseases;
	}

	@GetMapping(value = "/diseases/{id}")
	public Disease getDiseaseById(@PathVariable("id") String id) {
		return diseases.stream().filter(disease -> disease.getId().equals(id)).findAny().orElse(null);
	}
}
