package ExArrays;

import java.util.*;

public class VetorInvertido {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            int n = sc.nextInt();

            int num[] = new int[n];

            for(int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }

            System.out.print("VETOR INVERTIDO: ");

            for(int i = num.length - 1; i >= 0; i--) {
                System.out.print(num[i] + " ");
            }

            sc.close();
        }

    }
}
