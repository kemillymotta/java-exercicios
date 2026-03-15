package enumeracoes.compEx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class OrderProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            System.out.println("Enter client data:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Birth date (DD/MM/YYYY): ");
            Date birthDate = sdf.parse(sc.next());
            sc.nextLine();

            Client client = new Client(name, email, birthDate);

            System.out.println("Enter order data:");
            System.out.print("Status: ");
            String statusStr = sc.nextLine();
            OrderStatus status = OrderStatus.valueOf(statusStr.toUpperCase());

            Order order = new Order(new Date(), status, client);

            System.out.print("How many items to this order? ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.println("Enter #" + i + " item data:");
                System.out.print("Product name: ");
                sc.nextLine();
                String productName = sc.nextLine();
                System.out.print("Price: ");
                double productPrice = sc.nextDouble();
                System.out.print("Quantity: ");
                int productQuantity = sc.nextInt();

                Products product = new Products(productName, productPrice);
                OrderItem item = new OrderItem(productQuantity, productPrice, product);
                order.addItem(item);

            }

            System.out.println(order);

            sc.close();
        }
    }
}
