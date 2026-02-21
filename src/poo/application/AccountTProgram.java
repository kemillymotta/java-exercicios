package application;

import entities.AccountT;

import java.util.Scanner;

public class AccountTProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AccountT acc1 = new AccountT();
        System.out.println("ACCOUNT 1: ");
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        sc.nextLine();
        acc1.setNumber(number);

        System.out.print("Enter name: ");
        String holder = sc.nextLine();
        acc1.setHolder(holder);

        System.out.print("Deposit: ");
        double amount = sc.nextDouble();
        acc1.deposit(amount);

        AccountT acc2 = new AccountT();
        System.out.println("\nACCOUNT 2: ");
        System.out.print("Enter number: ");
        number = sc.nextInt();
        sc.nextLine();
        acc2.setNumber(number);

        System.out.print("Enter name: ");
        holder = sc.nextLine();
        acc2.setHolder(holder);

        System.out.print("Deposit: ");
        amount = sc.nextDouble();
        acc2.deposit(amount);

        System.out.println("\nAccounts data:");
        System.out.println(acc1);
        System.out.println(acc2);

        int option;
        do {
            System.out.println("\nTransfer money to whom?");
            System.out.printf("1 - %s%n", acc1.getHolder());
            System.out.printf("2 - %s%n", acc2.getHolder());
            option = sc.nextInt();

            if (option != 1 && option != 2) {
                System.out.println("Please enter a valid option.");
            }

        } while (option != 1 && option != 2);

        System.out.print("Enter transfer value: ");
        double transferValue = sc.nextDouble();

        if (option == 1) {
            acc2.transfer(acc1, transferValue);
        } else {
            acc1.transfer(acc2, transferValue);
        }

        System.out.println("\nUpdated data:");
        System.out.println(acc1);
        System.out.println(acc2);

        sc.close();
    }
}
