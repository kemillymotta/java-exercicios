package arrays.exemplosAulas;

import java.util.*;

public class ProductsProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Products(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
