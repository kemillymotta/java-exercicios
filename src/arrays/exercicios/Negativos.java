package ExArrays;

import java.util.*;

public class Negativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        if (n > 10) {
            do {
                System.out.print("Digite um número menor que 10: ");
                n = sc.nextInt();
            } while (n > 10);
        }

        int[] vetor = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for(int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }


}
