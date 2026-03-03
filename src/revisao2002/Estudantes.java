package revisao2002;

import java.util.*;
public class Estudantes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantos estudantes? ");
            int n = sc.nextInt();

            String nomes[] = new String[n];
            double notas[] = new double[n];
            double maiorNota = 0, menorNota = 0, soma = 0;
            int aprovados = 0;

            for(int i = 0; i < nomes.length; i++) {
                System.out.printf("Estudante #%d:%n", i+1);
                sc.nextLine();
                System.out.print("Nome: ");
                nomes[i] = sc.nextLine();
                System.out.print("Nota: ");
                notas[i] = sc.nextDouble();

                soma += notas[i];

                if(notas[i] > maiorNota) {
                    maiorNota = notas[i];
                } if (notas[i] < menorNota) {
                    menorNota = notas[i];
                } if (notas[i] >= 6) {
                    aprovados++;
                }
            }

            double media = soma / n;

            System.out.printf("Média da turma: %.2f%n", media);
            System.out.printf("Aprovados: %d%n", aprovados);
            System.out.printf("Maior nota: %.2f%n", maiorNota);
            System.out.printf("Menor nota: %.2f%n", menorNota);




            sc.close();
        }
    }
}
