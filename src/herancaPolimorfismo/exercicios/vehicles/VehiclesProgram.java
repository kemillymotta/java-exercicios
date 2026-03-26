package herancaPolimorfismo.exercicios.vehicles;

import java.util.*;
public class VehiclesProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            List<Vehicles> list = new ArrayList<>();

            System.out.print("Enter the numbere of vehicles: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.print("Vehicle #" + i + " Car, Bicycle or Truck (c/b/t)? ");
                char op = sc.next().charAt(0);
                System.out.print("Brand: ");
                String brand = sc.next();
                System.out.print("Max speed: ");
                double speed = sc.nextDouble();

                if(op == 'c') {
                    System.out.print("Doors: ");
                    int doors = sc.nextInt();
                    list.add(new Car(brand,speed,doors));
                } else if(op == 'b') {
                    System.out.print("Gears: ");
                    int gears = sc.nextInt();
                    list.add(new Bicycle(brand, speed, gears));
                } else {
                    System.out.print("Load capacity (kg)? ");
                    double loadCapacity = sc.nextDouble();
                    list.add(new Truck(brand, speed, loadCapacity));
                }
            }

            System.out.println();
            System.out.println("VEHICLES LIST:");
            for(Vehicles veh : list) {
                System.out.println(veh.describe());
            }

            sc.close();
        }
    }
}
