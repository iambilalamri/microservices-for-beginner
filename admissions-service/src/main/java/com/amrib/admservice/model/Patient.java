package com.amrib.admservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Patient {

	private String id;
	private String firstname;
	private String lastname;
	private String ssNumber;
	private String nationality;
	private boolean isMedicalComplement;
	// private MedicalFolder folder;

}
