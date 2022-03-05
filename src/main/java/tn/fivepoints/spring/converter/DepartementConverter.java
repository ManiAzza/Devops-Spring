package tn.fivepoints.spring.converter;

import org.springframework.stereotype.Component;

import tn.fivepoints.spring.dto.DepartementDto;
import tn.fivepoints.spring.entities.Departement;



@Component
public class DepartementConverter {
	
	public DepartementDto entityToDto(Departement d) {
		return new DepartementDto(d.getId(),d.getName());
	}
	
	public static Departement dtoToEntity(DepartementDto d) {
		return new Departement(d.getId(),d.getName());
	}


}
