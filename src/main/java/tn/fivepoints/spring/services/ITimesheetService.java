package tn.fivepoints.spring.services;

import java.util.Date;
import java.util.List;

import tn.fivepoints.spring.entities.Employe;
import tn.fivepoints.spring.entities.Mission;

public interface ITimesheetService {

	public int ajouterMission(Mission mission);
	public Mission getMissionById(int missionId);
	public int affecterMissionADepartement(int missionId, int depId);
	public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin);
	public int validerTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin, int validateurId);
	public List<Mission> findAllMissionByEmployeJPQL(int employeId);
	public List<Employe> getAllEmployeByMission(int missionId);
}
