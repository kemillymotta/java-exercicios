package herancaPolimorfismo.exercicios.spaceMissions;

public class ProbeMission extends SpaceMission {

    private String destination;
    private int travelYears;

    public ProbeMission(){}

    public ProbeMission(String missionName, int year, String destination, int travelYears) {
        super(missionName, year);
        this.destination = destination;
        this.travelYears = travelYears;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTravelYears() {
        return travelYears;
    }

    public void setTravelYears(int travelYears) {
        this.travelYears = travelYears;
    }

    @Override
    public String missionReport() {
        return getMissionName()
                + " ("
                + getYear()
                + ") | PROBE - Destination: "
                + getDestination()
                + ", travel: "
                + getTravelYears()
                + " yr";
    }
}
