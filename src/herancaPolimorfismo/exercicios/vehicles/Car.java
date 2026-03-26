package herancaPolimorfismo.exercicios.vehicles;

public class Car extends Vehicles {

    private int doors;

    public Car() {

    }

    public Car(String brand, double speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String describe(){
        return getBrand()
                + " (car) - "
                + getSpeed()
                + " km/h | Doors: "
                + getDoors();
    }
}
