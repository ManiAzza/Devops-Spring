package tn.fivepoints.spring.converter;

import org.springframework.stereotype.Component;

import tn.fivepoints.spring.dto.ContratDto;
import tn.fivepoints.spring.entities.Contrat;

@Component
public class ContratConverter {
	public ContratDto entityToDto(Contrat contrat)
	{
		return new ContratDto(contrat.getReference(),contrat.getDateDebut(),
				contrat.getTypeContrat(), contrat.getSalaire());
	}
	
	public Contrat dtoToEntity(ContratDto contratDto)
	{
		return new Contrat(contratDto.getDateDebut(),contratDto.getType(),contratDto.getSalaire());
	}
}
