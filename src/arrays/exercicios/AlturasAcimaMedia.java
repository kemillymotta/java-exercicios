package ExArrays;

import java.util.*;

public class AlturasAcimaMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantas pessoas? ");
            int n = sc.nextInt();

            double alturas[] = new double[n];

            double somaAlturas = 0;
            for(int i = 0; i < alturas.length; i++) {
                System.out.printf("Digite a altura da %da pessoa: ", i+1);
                alturas[i] = sc.nextDouble();
                somaAlturas += alturas[i];
            }

            double mediaAlturas = somaAlturas / alturas.length;
            int acimaMedia = 0;

            for(int i = 0; i < alturas.length; i++) {
                if (alturas[i] > mediaAlturas) {
                    acimaMedia++;
                }
            }

            System.out.printf("MEDIA = %.2f%n", mediaAlturas);
            System.out.printf("EPESSOAS ACIMA DA MEDIA = %d", acimaMedia);

            sc.close();
        }

    }
}
