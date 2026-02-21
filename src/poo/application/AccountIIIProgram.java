package application;

import entities.AccountIII;

import java.util.*;

public class AccountIIIProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        AccountIII account = null;

        char option;
        do {
            System.out.print("Is there an initial deposit (y/n)? ");
            option = sc.next().charAt(0);

            if (option == 'Y' || option == 'y') {
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                account = new AccountIII(number, holder, initialDeposit);

            } else if (option == 'N' || option == 'n') {
                account = new AccountIII(number, holder);

            } else {
                System.out.println("Invalid option. Please enter Y or N.");
            }

        } while (option != 'Y' && option != 'y' && option != 'N' && option != 'n');

        System.out.printf("Account data:%n%s%n", account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println(account);

        sc.close();

    }
}
