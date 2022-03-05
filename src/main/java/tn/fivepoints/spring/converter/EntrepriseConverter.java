package tn.fivepoints.spring.converter;

import org.springframework.stereotype.Component;

import tn.fivepoints.spring.dto.EntrepriseDto;
import tn.fivepoints.spring.entities.Entreprise;

@Component
public class EntrepriseConverter {
	public EntrepriseDto entityToDto(Entreprise e) {
		return new EntrepriseDto(e.getId(),e.getName(),e.getRaisonSocial());
	}
	
	public static Entreprise dtoToEntity(EntrepriseDto e) {
		return new Entreprise(e.getId(),e.getName(),e.getRaisonSocial());
	}

}
