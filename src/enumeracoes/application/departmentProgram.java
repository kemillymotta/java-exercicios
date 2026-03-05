package enumeracoes.application;

import enumeracoes.entities.department;
import enumeracoes.entities.hourContract;
import enumeracoes.entities.worker;
import enumeracoes.entitiesEnum.workerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class departmentProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); {

            System.out.print("Enter department's name: ");
            String departmentName = sc.nextLine();
            System.out.println("Enter worker data:");
            System.out.print("Name: ");
            String workerName = sc.nextLine();
            System.out.print("Level: ");
            String workerLevel = sc.nextLine();
            System.out.print("Base salary: ");
            double baseSalary = sc.nextDouble();

            worker worker = new worker(workerName, enumeracoes.entitiesEnum.workerLevel.valueOf(workerLevel),
                    baseSalary, new department(departmentName));

            System.out.print("How many contracts to this worker? ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.println("Enter contract #" + i + " data:");
                System.out.print("Date (DD/MM/YYYY): ");
                Date contractDate = sdf.parse(sc.next());
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Duration (hours): ");
                int hours = sc.nextInt();
                hourContract contract = new hourContract(contractDate, valuePerHour, hours);
                worker.addContract(contract);
            }

            System.out.print("\nEnter month and year to calculate income(MM/YYYY): ");
            String monthAndYear = sc.next();
            int month = Integer.parseInt(monthAndYear.substring(0, 2));
            int year = Integer.parseInt(monthAndYear.substring(3));

            System.out.println("Name: " + worker.getName());
            System.out.println("Department: " + worker.getDepartment().getName());
            System.out.println("Income for " + monthAndYear + ": " +
                    String.format("%.2f",worker.income(year, month)));

            sc.close();
        }
    }

}
