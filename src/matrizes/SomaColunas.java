package matrizes;

import java.util.*;

public class SomaColunas {
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

            for(int j = 0; j < m; j++) {
                int soma = 0;

                for(int i = 0; i < n; i++) {
                    soma += mat[i][j];
                }

                System.out.printf("Coluna %d: soma = %d%n", j, soma);
            }



            sc.close();
        }
    }
}
