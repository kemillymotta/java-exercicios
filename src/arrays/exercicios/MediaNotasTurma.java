package ExArrays;

import java.util.*;

public class MediaNotasTurma {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantos alunos? ");
            int n = sc.nextInt();

            String alunos[] = new String[n];
            double notas[] = new double[n];

            double somaNotas = 0;

            for(int i = 0; i < n; i++) {
                System.out.printf("Nome do %do aluno: ", i+1);
                alunos[i] = sc.next();
                System.out.printf("Nota do %do aluno: ", i+1);
                notas[i] = sc.nextDouble();

                somaNotas += notas[i];
            }

            double mediaTurma = somaNotas / n;

            System.out.printf("MEDIA DA TURMA: %.2f%n", mediaTurma);
            for(int i = 0; i < n; i++) {
                if(notas[i] < mediaTurma) {
                    System.out.printf("ALUNOS ABAIXO DA MEDIA: %n%s ", alunos[i]);
                }
            }



            sc.close();
        }
    }
}
