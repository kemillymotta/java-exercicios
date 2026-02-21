package matrizes;

import java.util.*;

public class NegNumeros {
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

            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    if(mat[i][j] < 0) {
                        mat[i][j] = 0;
                    }

                    System.out.printf("%d ", mat[i][j]);
                }


            }


            sc.close();
        }
    }
}
