package herancaPolimorfismo.exercicios.musicalInstruments;

public class Percussion extends Instrument {

    private int pieces;
    private boolean hasCymbals;
    private int bpm;

    public Percussion() {
    }

    public Percussion(String name, String origin, String tuning, int pieces, boolean hasCymbals, int bpm) {
        super(name, origin, tuning);
        this.pieces = pieces;
        this.hasCymbals = hasCymbals;
        this.bpm = bpm;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public boolean isHasCymbals() {
        return hasCymbals;
    }

    public void setHasCymbals(boolean hasCymbals) {
        this.hasCymbals = hasCymbals;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    @Override
    public String techSheet() {
        return getName()
                + "[Percussion | "
                + getOrigin()
                + "] - "
                + getPieces()
                + " pieces, "
                + (hasCymbals ? "has cymbals" : "does not has cymbals")
                + ", max "
                + getBpm()
                + " BPM";
    }
}
