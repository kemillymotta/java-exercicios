package loops;

import java.util.*;

public class ex28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String aluno = sc.nextLine();

        double somaTotal = 0;

        for (int i = 1; i <= 3; i++) {

            double notas;

            do {
                System.out.printf("Digite a nota %d do aluno %s: ", i, aluno);
                notas = sc.nextDouble();

                if (notas < 0 || notas > 10) {
                    System.out.println("NOTA INVÁLIDA. DIGITE NOVAMENTE.");
                }

            } while (notas < 0 || notas > 10);

            somaTotal += notas;
        }

        double media = somaTotal / 3;
        System.out.printf("Média final do aluno %s é %.2f%n", aluno, media);

        sc.close();
    }
}
