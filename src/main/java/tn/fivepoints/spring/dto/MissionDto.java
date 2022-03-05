package tn.fivepoints.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import tn.fivepoints.spring.entities.Departement;
import tn.fivepoints.spring.entities.Timesheet;

import java.util.List;

@Data
@AllArgsConstructor
public class MissionDto {

    private int id;
    private String name;
    private String description;
    private Departement departement;
    private List<Timesheet> timesheets;

}
