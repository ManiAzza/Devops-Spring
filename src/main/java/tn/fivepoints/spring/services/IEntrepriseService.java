package tn.fivepoints.spring.services;

import java.util.List;

import tn.fivepoints.spring.entities.Departement;
import tn.fivepoints.spring.entities.Entreprise;

public interface IEntrepriseService {

	public int ajouterEntreprise(Entreprise entreprise);

	public int ajouterDepartement(Departement dep);

	public int affecterDepartementAEntreprise(int depId, int entrepriseId);

	List<String> getAllDepartementsNamesByEntreprise(int entrepriseId);

	public int deleteEntrepriseById(int entrepriseId);

	public int deleteDepartementById(int depId);

	public Entreprise getEntrepriseById(int entrepriseId);

	public Departement getDepartementById(int departementId);

}
