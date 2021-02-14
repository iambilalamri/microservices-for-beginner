package com.amrib.hrservice.model;

import java.util.List;

public class EmployeeList {

	private List<Employe> employes;

	public EmployeeList() {
		super();
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	@Override
	public String toString() {
		return "EmployeeList [employes=" + employes + "]";
	}

}
