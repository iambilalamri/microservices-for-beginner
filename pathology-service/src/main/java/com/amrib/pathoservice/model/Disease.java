package com.amrib.pathoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disease {
	
	private String id;
	private String name;
	private String description;
	private String traitment;

}
