package herancaPolimorfismo.exercicios.vehicles;

public class Bicycle extends Vehicles{

    private int gears;

    public Bicycle() {

    }

    public Bicycle(String brand, double speed, int gears) {
        super(brand, speed);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public String describe(){
        return getBrand()
                + " (bicycle) - "
                + getSpeed()
                + " km/h | Gears: "
                + getGears();
    }
}
