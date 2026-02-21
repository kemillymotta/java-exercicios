package application;

import entities.AccountII;

import java.util.*;

public class AccountIIProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AccountII bank = new AccountII();

        System.out.println("Account number:");
        bank.number = sc.nextInt();
        sc.nextLine();
        System.out.println("Name:");
        bank.holder = sc.nextLine();
        System.out.println("Balance:");
        bank.balance = sc.nextDouble();
        System.out.println();
        System.out.println("Account data: " + bank);
        System.out.println();

        int option;

        do {
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("0 - EXIT");
            option = sc.nextInt();

            if(option == 1) {
                System.out.println("Enter deposit amount:");
                double amount = sc.nextDouble();
                bank.deposit(amount);
            } else if (option == 2) {
                System.out.println("Enter withdraw amounta (tax: $ 5.00):");
                double amount = sc.nextDouble();
                bank.withdraw(amount);
            } else if (option == 0) {
                System.out.println("PROGRAM FINISHED.");
            } else {
                System.out.println("Invalid option.");
            }

            if (option == 1 || option == 2) {
                System.out.println("Updated account data: " + bank);
            }

        }while(option != 0);

        sc.close();
    }
}
