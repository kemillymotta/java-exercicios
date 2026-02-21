package matrizes;

import java.util.*;

public class MaioresX {
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

            int x = sc.nextInt();

            int count = 0;
            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    if(mat[i][j] > x) {
                        count++;
                    }
                }
            }

            System.out.printf("MAIORES QUE %d = %d", x, count);

            sc.close();
        }
    }
}
