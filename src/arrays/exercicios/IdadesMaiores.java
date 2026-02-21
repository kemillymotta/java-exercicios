package ExArrays;

import java.util.*;

public class IdadesMaiores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            int n = sc.nextInt();

            int idades[] = new int[n];

            int somaMaiores = 0;
            for(int i = 0; i < idades.length; i++) {
                idades[i] = sc.nextInt();
            }

            int maioresIdade = 0;

            for(int i = 0; i < idades.length; i++) {
                if(idades[i] >= 18) {
                    maioresIdade++;

                    somaMaiores += idades[i];
                }
            }

            double mediaMaiores = (double)somaMaiores / maioresIdade;

            System.out.printf("MAIORES DE IDADE = %d%n", maioresIdade);
            System.out.printf("MEDIA DOS MAIORES = %.1f", mediaMaiores);

            sc.close();
        }
    }
}
