package herancaPolimorfismo.exercicios.vehicles;

public class Truck extends Vehicles {

    private double loadCapacity;

    public Truck(){

    }

    public Truck(String brand, double speed, double loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String describe() {
        return getBrand()
                + " (truck) - "
                + getSpeed()
                + " km/h | Load capacity: "
                + getLoadCapacity()
                + " kg";
    }
}
