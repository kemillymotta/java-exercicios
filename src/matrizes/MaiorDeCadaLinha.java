package matrizes;

import java.util.*;

public class MaiorDeCadaLinha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {

            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            int mat[][] = new int[linha][coluna];

            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    mat[i][j] = sc.nextInt();
                }

            }

            for(int i = 0; i < linha; i++) {

                int maior = mat[i][0];
                int colunaPosi = 0;

                for(int j = 0; j < coluna; j++) {
                    if(mat[i][j] > maior) {
                        maior = mat[i][j];
                        colunaPosi = j;
                    }

                }

                System.out.printf("Linha %d: maior = %d, coluna = %d%n", i + 1, maior, colunaPosi + 1);
            }


            sc.close();
        }
    }
}
