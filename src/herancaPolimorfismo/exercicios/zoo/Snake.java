package herancaPolimorfismo.exercicios.zoo;

public class Snake extends Animal {

    private boolean isVenomous;
    private double length;

    public Snake() {
    }

    public Snake(String name, int age, double length, boolean isVenomous) {
        super(name, age);
        this.length = length;
        this.isVenomous = isVenomous;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String sizzle(){
        return "Hisss!";
    }

    @Override
    public String soundCard() {
        return getName()
                + " (snake, "
                + getAge()
                + " yr) - "
                + sizzle()
                + " ["
                + (isVenomous ? "VENOMOUS" : "non-venomous")
                + "]";
    }
}
