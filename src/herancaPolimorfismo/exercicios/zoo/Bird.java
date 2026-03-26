package herancaPolimorfismo.exercicios.zoo;

public class Bird extends Animal {

    private boolean canFly;
    private double wingspan;

    public Bird() {
    }

    public Bird(String name, int age, boolean canFly, double wingspan) {
        super(name, age);
        this.canFly = canFly;
        this.wingspan = wingspan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public String peep() {
        return "Tweet!";
    }

    @Override
    public String soundCard() {
        return getName()
                + " (bird, "
                + getAge()
                + " yr - "
                + peep()
                + " Wingspan: "
                + getWingspan()
                + " cm ["
                + (canFly ? "can fly" : "cannot fly")
                + "]";

    }
}
