package herancaPolimorfismo.exercicios.taxes;

import java.util.*;
public class ClientProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            List<Client> list = new ArrayList<>();

            System.out.print("Enter the number of tax payers: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.println("Tax payer #" + i + " data:");
                System.out.print("Individual or company (i/c)? ");
                char op = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();

                switch (op) {
                    case 'i':
                        System.out.print("Health expenditures: ");
                        double healthExpenditures = sc.nextDouble();

                        list.add(new Individual(name, anualIncome, healthExpenditures));
                        break;
                    case 'c':
                        System.out.print("Number of employees: ");
                        int employees = sc.nextInt();

                        list.add(new Company(name, anualIncome, employees));
                        break;
                }

            }

            System.out.println();
            System.out.println("TAXES PAID:");
            double sum = 0.0;
            for (Client tp : list) {
                sum += tp.taxes();
                System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.taxes()));
            }

            System.out.println();
            System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));




            sc.close();
        }
    }
}
