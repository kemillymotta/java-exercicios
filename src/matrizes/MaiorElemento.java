package matrizes;

import java.util.*;

public class MaiorElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];

            int maior = mat[0][0];
            int linha = 0;
            int coluna = 0;

            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();
                    if(mat[i][j] > maior) {
                        maior = mat[i][j];
                        linha = i;
                        coluna = j;
                }
            }
            }

            System.out.printf("MAIOR = %d%n", maior);
            System.out.printf("POSIÇÃO = %d,%d", linha,coluna);



            sc.close();
        }
    }
}
