package application;

import entities.EmployeeII;

import java.util.*;

public class EmployeeIIProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeII emp = new EmployeeII();

        System.out.println("Name:");
        emp.name = sc.nextLine();
        System.out.println("Gross salary:");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax:");
        emp.tax = sc.nextDouble();
        System.out.println();

        System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.netSalary());
        System.out.println();

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();

        emp.increaseSalary(percentage);
        System.out.printf("Updated data: %s, $ %.2f", emp.name, emp.netSalary());

        sc.close();
    }
}
