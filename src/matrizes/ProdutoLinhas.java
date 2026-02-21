package matrizes;

import java.util.*;

public class ProdutoLinhas {
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

            int produto = 1;

            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    produto *= mat[i][j];
                }

                System.out.printf("Linha %d: produto = %d%n", i, produto);
            }

            sc.close();
        }
    }
}
