package herancaPolimorfismo.exercicios.zoo;

import java.util.*;
import herancaPolimorfismo.exercicios.zoo.Dog;

import javax.swing.*;

public class AnimalProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            List<Animal> list = new ArrayList<>();

            System.out.print("Enter number of animals: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.println("Animal #" + i + " - Dog, Bird or Snake (d/b/s)? ");
                char op = sc.next().charAt(0);
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Age: ");
                int age = sc.nextInt();

                if(op == 'd') {
                    System.out.print("Breed: ");
                    String breed = sc.next();
                    System.out.print("Vaccines up to date (y/n)? ");
                    char vac = sc.next().charAt(0);
                    boolean vaccineOk = (vac == 'y');

                    list.add(new Dog(name, age, breed, vaccineOk));
                } else if (op == 'b') {
                    System.out.print("Can fly (y/n)? ");
                    char fly = sc.next().charAt(0);
                    boolean canFly = (fly == 'y');
                    System.out.print("Wingspan (cm): ");
                    double wingspan = sc.nextDouble();

                    list.add(new Bird(name, age, canFly, wingspan));
                } else {
                    System.out.print("Venemous (y/n)? ");
                    char venemous = sc.next().charAt(0);
                    boolean isVenemous = (venemous == 'y');
                    System.out.print("Length (cm): ");
                    double length = sc.nextDouble();

                    list.add(new Snake(name, age, length, isVenemous));
                }
            }
            System.out.println();
            System.out.println("ANIMAL SOUND CARDS: ");
            for(Animal ani : list){
                System.out.println(ani.soundCard());
            }


            sc.close();
        }
    }
}
