package ExArrays;

import java.util.*;

public class MenorValorPosicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            int n = sc.nextInt();

            double num[] = new double[n];

            for(int i = 0; i < num.length; i++) {
                num[i] = sc.nextDouble();
            }

            double menorNum = num[0];
            int posicao = 0;

            for(int i = 0; i < num.length; i++) {
                if(num[i] < menorNum) {
                    menorNum = num[i];
                    posicao = i;
                }
            }

            System.out.printf("MENOR VALOR = %.1f%n", menorNum);
            System.out.printf("POSICAO DO MENOR VALOR %d", posicao);

            sc.close();
        }
    }
}
