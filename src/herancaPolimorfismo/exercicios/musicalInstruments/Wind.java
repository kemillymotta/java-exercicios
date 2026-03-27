package herancaPolimorfismo.exercicios.musicalInstruments;

public class Wind extends Instrument {

    private String material;
    private int octaves;

    public Wind() {
    }

    public Wind(String name, String origin, String tuning, String material, int octaves) {
        super(name, origin, tuning);
        this.material = material;
        this.octaves = octaves;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getOctaves() {
        return octaves;
    }

    public void setOctaves(int octaves) {
        this.octaves = octaves;
    }

    @Override
    public String techSheet() {
        return getName()
                + " [Wind | "
                + getOrigin()
                + " | "
                + getTuning()
                + "] - "
                + getMaterial()
                + " , "
                + getOctaves()
                + " octaves";
    }
}
