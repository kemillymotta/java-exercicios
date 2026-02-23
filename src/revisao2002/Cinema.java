package revisao2002;

import java.util.*;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            int mat[][] = new int[5][6];

            int lugaresLivres = 0;
            System.out.println("Essa matriz representa assentos, reserve lugares:");
            System.out.println("--- 0 livre, 1 ocupado ---");
            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();

                    if (mat[i][j] == 0) {
                        lugaresLivres++;
                    }
                }
            }

            System.out.printf("Lugares livres: %d", lugaresLivres);

            sc.close();
        }
    }
}
