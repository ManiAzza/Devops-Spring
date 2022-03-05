package tn.fivepoints.spring.converter;

import tn.fivepoints.spring.dto.MissionDto;
import tn.fivepoints.spring.entities.Mission;

public class MissionConverter {
    public MissionDto entityToDto(Mission e) {
        return new MissionDto(e.getId(),e.getName(), e.getDescription(),e.getDepartement(),e.getTimesheets());
    }

    public static Mission dtoToEntity(MissionDto e) {
        return new Mission(e.getName(),e.getDescription());
    }
}
