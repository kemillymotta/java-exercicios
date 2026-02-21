package application;

import entities.ProductII;

import java.util.*;

public class ProductIIProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProductII product = new ProductII();

        System.out.println("Name:");
        product.name = sc.nextLine();
        System.out.println("Price:");
        product.price = sc.nextDouble();
        System.out.println("Quantity:");
        product.quantity = sc.nextInt();

        System.out.println(product);
        System.out.println();

        int option;

        do {
            System.out.println("1 - Add");
            System.out.println("2 - Remove");
            System.out.println("0 - Exit");
            System.out.println("Choose your option:");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Quantity:");
                int quantity = sc.nextInt();
                product.addProducts(quantity);
                System.out.println("Uptated: " + product);
                System.out.println();
            } else if (option == 2) {
                System.out.println("Quantity:");
                int quantity = sc.nextInt();
                product.removeProducts(quantity);
                System.out.println("Uptated: " + product);
                System.out.println();
            } else if (option == 0) {
                System.out.println("PROGRAM FINISHED.");

            } else {
                System.out.println("INVALID OPTION");
                System.out.println();
            }


        }while(option != 0);
        sc.close();
    }
}
