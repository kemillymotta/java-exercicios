package herancaPolimorfismo.exercicios.musicalInstruments;

public class Stringed extends Instrument {

    private int strings;
    private boolean hasFrets;

    public Stringed() {
    }

    public Stringed(String name, String origin, String tuning, int strings, boolean hasFrets) {
        super(name, origin, tuning);
        this.strings = strings;
        this.hasFrets = hasFrets;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public boolean isHasFrets() {
        return hasFrets;
    }

    public void setHasFrets(boolean hasFrets) {
        this.hasFrets = hasFrets;
    }


    @Override
    public String techSheet() {
        return getName()
                + " [Stringed | "
                + getOrigin()
                + " | "
                + getTuning()
                + "] - "
                + getStrings()
                + " strings, "
                + (hasFrets ? "fretted" : "not fretted");
    }
}
