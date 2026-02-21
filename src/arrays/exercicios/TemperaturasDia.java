package ExArrays;

import java.util.*;

public class TemperaturasDia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantas temperaturas? ");
            int n = sc.nextInt();

            double temp[] = new double[n];
            double somaTemp = 0;

            for(int i = 0; i < n; i++) {
                System.out.printf("Digite a %da temperatura: ", i+1);
                temp[i] = sc.nextDouble();

                somaTemp += temp[i];
            }

            double maiorTemp = temp[0];
            double menorTemp = temp[0];

            for(int i = 0; i < n; i++) {
                if (temp[i] > maiorTemp) {
                    maiorTemp = temp[i];
                } if (temp[i] < menorTemp) {
                    menorTemp = temp[i];
                }
            }

            int acimaTrinta = 0;

            for(int i = 0; i < n; i ++) {
                if (temp[i] > 30) {
                    acimaTrinta++;
                }
            }

            System.out.printf("MAIOR TEMPERATURA = %.2f%n", maiorTemp);
            System.out.printf("MENOR TEMPERATURA = %.2f%n", menorTemp);
            System.out.printf("TEMPERATURAS ACIMA DE 30 = %d", acimaTrinta);

            sc.close();
        }
    }
}
