package matrizes;

import java.util.*;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            int n = sc.nextInt();

            int mat[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int soma = 0;

            for(int i = 0; i < n; i++) {
                soma += mat[i][i];
            }

            System.out.printf("SOMA DIAGONAL = %d", soma);


            sc.close();
        }
    }
}
