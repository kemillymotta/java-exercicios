package application;

import entities.Account;

import java.util.*;

public class AccountProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        Account account;

        char response;
        do {
            System.out.print("Is there an initial deposit (y/n)? ");
            response = sc.next().charAt(0);

            if (response == 'Y' || response == 'y') {
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                account = new Account(number, holder, initialDeposit);

            } else if (response == 'N' || response == 'n') {
                account = new Account(number, holder);

            } else {
                System.out.println("Invalid option. Please enter Y or N.");
                account = null;
            }

        } while (response != 'Y' && response != 'y'
                && response != 'N' && response != 'n');

        System.out.println();
        System.out.printf("Account data:%n%s%n", account);
        System.out.println();

        int option;

        do {
            System.out.println("MENU");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Change your infos");
            System.out.println("4 - Exit");

            System.out.print("Choose an option: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.print("Enter a deposit value: ");
                double depositValue = sc.nextDouble();
                account.deposit(depositValue);

                System.out.println();
                System.out.println("Updated account data:");
                System.out.println(account);
                System.out.println();

            } else if (option == 2) {

                double withdrawValue;

                do {
                    System.out.print("Enter a withdraw value (WITHDRAW LIMIT: $ 2500): ");
                    withdrawValue = sc.nextDouble();

                    if (withdrawValue > 2500) {
                        System.out.println("There's a $ 2500 withdraw limit.");
                    }

                } while (withdrawValue > 2500);

                account.withdraw(withdrawValue);

                System.out.println();
                System.out.println("Updated account data:");
                System.out.println(account);
                System.out.println();

            } else if (option == 3) {
                sc.nextLine();
                System.out.print("Enter new holder name: ");
                String newHolder = sc.nextLine();
                account.setHolder(newHolder);

                System.out.println();
                System.out.println("Updated account data:");
                System.out.println(account);
                System.out.println();

            } else if (option == 4) {
                System.out.println("PROGRAM FINISHED");

            } else {
                System.out.println("Invalid number.");
            }

        } while (option != 4);

        sc.close();
    }
}
