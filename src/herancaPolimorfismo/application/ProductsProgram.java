package herancaPolimorfismo.application;

import herancaPolimorfismo.entities.Employee;
import herancaPolimorfismo.entities.ImportedProducts;
import herancaPolimorfismo.entities.Products;
import herancaPolimorfismo.entities.UsedProducts;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class ProductsProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            List<Products> list = new ArrayList<>();

            System.out.print("Enter the number of products: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.println("Product #" + i + " data:");
                System.out.print("Common, used or imported (c/u/i)? ");
                char ch = sc.next().charAt(0);
                System.out.print("Name: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                if (ch == 'c') {
                    list.add(new Products(name, price));
                } else if (ch == 'u') {
                    System.out.print("Manufacture date: ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new UsedProducts(name, price, date));
                } else {
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    list.add(new ImportedProducts(name, price, customsFee));
                }
            }

            System.out.println();
            System.out.println("PRICE TAGS:");
            for (Products prod : list) {
                System.out.println(prod.priceTag());
            }

            sc.close();
        }
    }
}
