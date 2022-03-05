package tn.fivepoints.spring.controller;

import java.util.Date;
import org.apache.log4j.Logger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.fivepoints.spring.converter.MissionConverter;
import tn.fivepoints.spring.dto.MissionDto;
import tn.fivepoints.spring.entities.Employe;
import tn.fivepoints.spring.entities.Mission;
import tn.fivepoints.spring.services.IEmployeService;
import tn.fivepoints.spring.services.IEntrepriseService;
import tn.fivepoints.spring.services.ITimesheetService;

@Controller
public class IControllerTimesheetImpl {
	private static final Logger l = Logger.getLogger(IControllerTimesheetImpl.class);
	@Autowired
	IEmployeService iemployeservice;
	@Autowired
	IEntrepriseService ientrepriseservice;
	@Autowired
	ITimesheetService itimesheetservice;

	public int ajouterMission(MissionDto mission) {
		
		itimesheetservice.ajouterMission(MissionConverter.dtoToEntity(mission));
		l.info("mission" + mission.getName() +" ajouté");
		return mission.getId();
	}

	public void affecterMissionADepartement(int missionId, int depId) {
		l.info("mission affecté");
		itimesheetservice.affecterMissionADepartement(missionId, depId);

	}
	public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin) {
		itimesheetservice.ajouterTimesheet(missionId, employeId, dateDebut, dateFin);

	}

	
	public void validerTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin, int validateurId) {
		itimesheetservice.validerTimesheet(missionId, employeId, dateDebut, dateFin, validateurId);

	}
	public List<Mission> findAllMissionByEmployeJPQL(int employeId) {

		return itimesheetservice.findAllMissionByEmployeJPQL(employeId);
	}


	public List<Employe> getAllEmployeByMission(int missionId) {

		return itimesheetservice.getAllEmployeByMission(missionId);
	}
}
