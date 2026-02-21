package ExArrays;

import java.util.*;

public class Soma {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vetor = new double[n];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for(int i =0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.print("VALORES =");

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf(" %.2f", vetor[i]);
        }

        System.out.printf("%nSOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f", media);


        sc.close();
    }
}
