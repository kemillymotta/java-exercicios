package ExArrays;

import java.util.*;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantos alunos serao digitados? ");
            int n = sc.nextInt();
            sc.nextLine();

            String nomes[] = new String[n];
            double notas1[] = new double[n];
            double notas2[] = new double[n];

            for(int i = 0; i < n; i++) {
                System.out.print("Aluno: ");
                nomes[i] = sc.next();
                System.out.print("Nota primeiro semestre: ");
                notas1[i] = sc.nextDouble();
                System.out.print("Nota segundo semestre: ");
                notas2[i] = sc.nextDouble();
            }

            double media = 0;
            System.out.println("ALUNOS APROVADOS:");
            for(int i = 0; i < n; i++) {
                media = (double) (notas1[i] + notas2[i]) / 2;

                if (media >= 6.0) {
                    System.out.printf("%s%n", nomes[i]);
                }
            }

            sc.close();
        }
    }
}
