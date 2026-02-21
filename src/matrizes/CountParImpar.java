package matrizes;

import java.util.*;

public class CountParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];

            int pares = 0;
            int impares = 0;

            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();

                    if(mat[i][j] % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                }
            }

            System.out.printf("PARES = %d%n", pares);
            System.out.printf("IMPARES = %d", impares);


            sc.close();
        }
    }
}
