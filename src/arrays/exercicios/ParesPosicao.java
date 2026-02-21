package ExArrays;

import java.util.*;

public class ParesPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantos numeros? ");
            int n = sc.nextInt();

            int num[] = new int[n];
            int posicao = 0;

            for(int i = 0; i < num.length; i++) {
                System.out.printf("Digite o %do numero: ", i+1);
                num[i] = sc.nextInt();
            }

            System.out.print("VALORES NAS POSICOES PARES: ");
            for(int i = 0; i < num.length; i++) {
                if(i % 2 == 0) {
                    posicao = i;
                    System.out.print(num[i] + " ");
                }
            }

            sc.close();
        }

    }
}
