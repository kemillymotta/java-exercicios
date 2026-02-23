package revisao2002.application;

import java.util.*;
import revisao2002.entities.Contacts;

public class ContactsProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Contacts> list = new ArrayList<>();

        System.out.println("How many people will be registered?");
        int n = sc.nextInt();
        sc.nextLine(); // limpar ENTER

        for (int i = 0; i < n; i++) {

            System.out.printf("%nContact #%d%n", i + 1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Telephone number: ");
            int number = sc.nextInt();
            sc.nextLine(); // limpar ENTER

            list.add(new Contacts(name, number));
        }

        System.out.print("Enter the name you want to search: ");
        String searchName = sc.nextLine();

        Contacts result = list.stream()
                .filter(x -> x.getName().equalsIgnoreCase(searchName))
                .findFirst()
                .orElse(null);

        if (result != null) {
            System.out.println("Contact found!");
            System.out.println("Telephone number: " + result.getNumber());
        } else {
            System.out.println("Contact not found");
        }

        sc.close();
    }
}