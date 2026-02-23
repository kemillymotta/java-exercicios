package revisao2002;

import java.util.*;

public class Posicoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Posição [" + i + "][" + j + "] = " + mat[i][j]);

            }
        }

        sc.close();
    }
}