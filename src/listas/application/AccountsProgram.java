package listas.application;

import listas.entities.Accounts;

import java.util.*;

public class AccountsProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            List<Accounts> list = new ArrayList<>();

            System.out.print("How many accounts will be registered? ");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++) {
                System.out.printf("%nAccount #%d:%n", i+1);
                System.out.print("Number: ");
                int id = sc.nextInt();
                System.out.print("Holder: ");
                String holder = sc.next();
                System.out.print("Balance: ");
                double balance = sc.nextDouble();

            }


            sc.close();
        }
    }
}
