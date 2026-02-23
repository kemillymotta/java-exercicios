package revisao2002;

import java.util.*;
public class MatrizSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            int mat[][] = new int[3][3];

            int soma = 0;
            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();

                    soma += mat[i][j];
                }
            }

            System.out.printf("Soma total: %d", soma);

            sc.close();
        }
    }
}
