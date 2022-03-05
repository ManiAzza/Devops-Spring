package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.fivepoints.spring.entities.Entreprise;


public interface EntrepriseRepository extends CrudRepository<Entreprise, Integer>  {
	
	
}
