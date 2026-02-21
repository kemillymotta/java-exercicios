package matrizes;

import java.util.*;

public class LinhaMaiorSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];

            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            int maiorSoma = 0;
            int maiorLinha = 0;

            for(int i = 0; i < mat.length; i++) {
                int soma = 0;
                for(int j = 0; j < mat[i].length; j++) {
                    soma += mat[i][j];
                }

                if(soma > maiorSoma) {
                    maiorSoma = soma;
                    maiorLinha = i;
                }
            }

            System.out.printf("Linha com maior soma = %d%n", maiorLinha);
            System.out.printf("Soma = %d", maiorSoma);



            sc.close();
        }
    }
}
