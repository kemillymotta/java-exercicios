package Pensionato;

import Pensionato.Rent;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            Rent[] rooms = new Rent[10];

            System.out.print("How many rooms will be rented? ");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++) {
                System.out.printf("Rent #%d:", i+1);
                System.out.print("\nName: ");
                String name = sc.next();
                System.out.print("Email: ");
                String email = sc.next();
                System.out.print("Room: ");
                int roomNumber = sc.nextInt();

                rooms[roomNumber] = new Rent(name, email, roomNumber);
            }

            System.out.println("Busy rooms:");
            for(int i = 0; i < rooms.length; i++) {
                if(rooms[i] != null) {
                    System.out.println(rooms[i]);
                }
            }

                sc.close();
        }
    }
}
