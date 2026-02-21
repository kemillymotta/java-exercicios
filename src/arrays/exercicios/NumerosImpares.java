package ExArrays;

import java.util.*;

public class NumerosImpares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantos numeros? ");
            int n = sc.nextInt();

            int num[] = new int[n];

            for(int i = 0; i < num.length; i++) {
                System.out.printf("Digite o %do numero: ", i+1);
                num[i] = sc.nextInt();
            }

            System.out.print("NUMEROS IMPARES = ");
            int somaImpares = 0;
            for(int i = 0; i < num.length; i++) {
                if (num[i] % 2 != 0) {
                    System.out.print(num[i] + " ");
                    somaImpares += num[i];
                }
            }

            System.out.printf("\nSOMA DOS IMPARES = %d", somaImpares);

            sc.close();
        }
    }
}
