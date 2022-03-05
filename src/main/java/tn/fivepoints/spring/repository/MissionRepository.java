package tn.fivepoints.spring.repository;
import org.springframework.data.repository.CrudRepository;

import tn.fivepoints.spring.entities.Mission;


public interface MissionRepository extends CrudRepository<Mission, Integer> {

}
