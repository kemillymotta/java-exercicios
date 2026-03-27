package herancaPolimorfismo.exercicios.spaceMissions;

import java.awt.*;

public class RoboticMission extends SpaceMission {

    private String roverName;
    private int operatingYears;

    public RoboticMission() {}

    public RoboticMission(String missionName, int year, String roverName, int operatingYears) {
        super(missionName, year);
        this.roverName = roverName;
        this.operatingYears = operatingYears;
    }

    public String getRoverName() {
        return roverName;
    }

    public void setRoverName(String roverName) {
        this.roverName = roverName;
    }

    public int getOperatingYears() {
        return operatingYears;
    }

    public void setOperatingYears(int operatingYears) {
        this.operatingYears = operatingYears;
    }

    @Override
    public String missionReport() {
        return getMissionName()
                + " ("
                + getYear()
                + ") | ROBOTIC - Rover: "
                + getRoverName()
                + ", "
                + getOperatingYears()
                + " years operating";
    }
}
