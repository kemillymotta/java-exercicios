package revisao2002.application;

import java.util.*;
import revisao2002.entities.Products;

public class ProductsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            List<Products> list = new ArrayList<>();

            System.out.println("How many products? ");
            int n = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < n; i++) {
                System.out.print("Product: ");
                String product = sc.nextLine();
                System.out.print("Code: ");
                int code = sc.nextInt();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                list.add(new Products(product, code, price));
            }

            System.out.print("What product you want to find? ");
            String searchProduct = sc.nextLine();
            Products result = list.stream()
                    .filter(x -> x.getProduct().equalsIgnoreCase(searchProduct))
                    .findFirst()
                    .orElse(null);

            if(result != null) {
                System.out.printf("PRODUCT %d FOUND%n", result.getCode());
                System.out.println("Name: " + result.getProduct());
                System.out.println("Price: " + result.getPrice());
            }else {
                System.out.println("PRODUCT NOT FOUND");
            }


            sc.close();
        }
    }
}
