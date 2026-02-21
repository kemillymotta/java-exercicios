package ExArrays;

import java.util.*;

public class MediaPares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantos elementos vai ter o vetor? ");
            int n = sc.nextInt();

            int vetor[] = new int[n];

            for(int i = 0; i < n; i++) {
                System.out.print("Digite um numero: ");
                vetor[i] = sc.nextInt();
            }

            int pares = 0, somaPares = 0;
            double mediaPares = 0;

            for(int i = 0; i < n; i++) {
                if(vetor[i] % 2 == 0) {
                    somaPares += vetor[i];
                    pares++;
                }
            }

            if(pares == 0) {
                System.out.println("NENHUM NÚMERO PAR.");
            }
            else {
                mediaPares = (double)somaPares / pares;
                System.out.printf("MEDIA DOS PARES = %.2f", mediaPares);
            }

            sc.close();
        }
    }
}
