package com.amrib.hrservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amrib.hrservice.model.Employe;

@RestController
@RequestMapping(value = "/api/v1")
public class HrController {

	List<Employe> employees = Arrays.asList(new Employe("1", "AAA", "BBB", "Doctor general", "aaa.bbb@gmail.com"),
			new Employe("1", "AAA", "BBB", "Doctor general", "aaa.bbb@gmail.com"),
			new Employe("1", "AAA", "BBB", "Doctor general", "aaa.bbb@gmail.com"),
			new Employe("1", "AAA", "BBB", "Doctor general", "aaa.bbb@gmail.com"));

	@GetMapping(value = "/employees")
	public List<Employe> getEmployees() {
		return employees;
	}

	@GetMapping(value = "/employees/{id}")
	public Employe getEmployeeById(@PathVariable("id") String id) {
		return employees.stream().filter(employee -> employee.getId().equals(id)).findAny().orElse(null);
	}

}
