package com.mitocode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="consulta") 
public class Consulta {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer idConsulta;

	
}
