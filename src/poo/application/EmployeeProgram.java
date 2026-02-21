package application;

import entities.Employee;

import java.util.*;

public class EmployeeProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee emp = new Employee(name, grossSalary, tax);

        System.out.println(emp);
        System.out.println();


        System.out.print("Increase percentage: ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println(emp);



        sc.close();
    }

}
