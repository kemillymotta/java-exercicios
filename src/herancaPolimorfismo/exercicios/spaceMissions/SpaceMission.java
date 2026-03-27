package herancaPolimorfismo.exercicios.spaceMissions;

public class SpaceMission {

    private String missionName;
    private int year;

    public SpaceMission(){}

    public SpaceMission(String missionName, int year) {
        this.missionName = missionName;
        this.year = year;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String missionReport() {
        return "SpaceMission{" +
                "missionName='" + missionName + '\'' +
                ", year=" + year +
                '}';
    }
}
