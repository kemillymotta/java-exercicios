package herancaPolimorfismo.exercicios.vehicles;

public class Vehicles {

    private String brand;
    private double speed;

    Vehicles(){

    }

    public Vehicles(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String describe() {
        return brand + " - " + speed + " km/h";
    }
}
