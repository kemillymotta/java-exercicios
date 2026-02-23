package revisao2002;

import java.util.*;

public class MatrizPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            int mat[][] = new int[4][4];
            int numPares = 0;

            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();

                    if(mat[i][j] % 2 == 0) {
                        numPares = mat[i][j];
                    }
                }
            }

            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    if(mat[i][j] % 2 == 0) {
                        System.out.println(mat[i][j]);
                    }
                }
            }


            sc.close();
        }
    }
}
