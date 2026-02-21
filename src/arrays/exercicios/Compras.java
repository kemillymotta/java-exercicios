package ExArrays;

import java.util.*;

public class Compras {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            int n = sc.nextInt();

            double valores[] = new double[n];

            double somaValores = 0;
            for(int i = 0; i < valores.length; i++) {
                valores[i] = sc.nextDouble();

                somaValores += valores[i];
            }

            int acimaCem = 0;
            for(int i = 0; i < valores.length; i++) {
                if(valores[i] > 100) {
                    acimaCem++;
                }
            }

            System.out.printf("TOTAL GASTO = %.1f%n", somaValores);
            System.out.printf("COMPRAS ACIMA DE 100 = %d", acimaCem);

            sc.close();
        }

    }
}
