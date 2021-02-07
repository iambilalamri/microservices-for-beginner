package com.amrib.admservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employe {

	private String id;
	private String firstname;
	private String lastname;
	private String specialty;
	private String email;

}
