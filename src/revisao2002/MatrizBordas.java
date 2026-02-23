package revisao2002;

import java.util.*;

public class MatrizBordas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();

                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    soma += mat[i][j];
                }
            }
        }

        System.out.println("Soma da borda: " + soma);

        sc.close();
    }
}