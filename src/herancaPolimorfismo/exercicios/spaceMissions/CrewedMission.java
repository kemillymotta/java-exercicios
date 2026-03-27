package herancaPolimorfismo.exercicios.spaceMissions;

public class CrewedMission extends SpaceMission {

    private int crewSize;
    private int daysInSpace;

    public CrewedMission() {
    }

    public CrewedMission(String missionName, int year, int crewSize, int daysInSpace) {
        super(missionName, year);
        this.crewSize = crewSize;
        this.daysInSpace = daysInSpace;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public int getDaysInSpace() {
        return daysInSpace;
    }

    public void setDaysInSpace(int daysInSpace) {
        this.daysInSpace = daysInSpace;
    }

    @Override
    public String missionReport() {
        return getMissionName()
                + " ("
                + getYear()
                + ") | CREWED - "
                + getCrewSize()
                + " astronauts, "
                + getDaysInSpace()
                + " days in space";
    }
}
