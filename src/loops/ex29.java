package loops;

import java.util.*;

public class ex29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos: ");
        int alunos = sc.nextInt();

        for (int i = 1; i <= alunos; i++) {

            double somaNotas = 0;

            System.out.println("\nAluno " + i);

            for (int j = 1; j <= 2; j++) {
                System.out.print("Digite a nota " + j + ": ");
                double nota = sc.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 2;
            System.out.println("A média do aluno " + i + " é: " + media);
        }
        
/*
 * pediu a quantidade de alunos
 * leu a quantidade de alunos
 * 
 * pra cada aluno, começa no 1, vai ate a quantidade de alunos lida, e adiciona mais 1
 * 
 * declara a soma das notas zerada
 * 
 * mostra o aluno q vai pedir a nota
 * 
 * para cada nota, inicia na nota 1, e pede ate a nota 2, adiciona 1 nota pra cada
 * aparece digite a nota tal
 * le a nota
 * acumula as notas digitadas
 * 
 * declara a media
 * imprime a media
 * */

        sc.close();
    }
}
