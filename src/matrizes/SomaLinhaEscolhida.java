package matrizes;

import java.util.*;

public class SomaLinhaEscolhida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int soma = 0;

        for (int j = 0; j < m; j++) {
            soma += mat[x][j];
        }

        System.out.printf("SOMA DA LINHA %d = %d%n", x, soma);

        sc.close();
    }
}
