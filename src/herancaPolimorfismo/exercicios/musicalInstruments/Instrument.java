package herancaPolimorfismo.exercicios.musicalInstruments;

public class Instrument {

    private String name;
    private String origin;
    private String tuning;

    public Instrument() {
    }
    public Instrument(String name, String origin, String tuning) {
        this.name = name;
        this.origin = origin;
        this.tuning = tuning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTuning() {
        return tuning;
    }

    public void setTuning(String tuning) {
        this.tuning = tuning;
    }

    public String techSheet() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", tuning='" + tuning + '\'' +
                '}';
    }
}
