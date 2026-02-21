package ExArrays;

import java.util.*;

public class MaiorPosicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0], posicao = 0;

        for(int i = 1; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %d%n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);

        sc.close();
    }


}
