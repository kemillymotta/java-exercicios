package matrizes;

import java.util.*;

public class SomaDasBordas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            /*
            * 1  2  3 4
            * 5  6  7  8
            * 9  10  11  12
            * */

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] mat = new int[n][m];

            int soma = 0;

            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();

                    if(j == 0 || j == m - 1 || i == 0 || i == n - 1) {
                        soma += mat[i][j];
                    }
                }
            }

            System.out.println("SOMA DAS BORDAS = " + soma);

            sc.close();
        }
    }
}
