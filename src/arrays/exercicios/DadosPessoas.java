package ExArrays;

import java.util.*;

public class DadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            System.out.print("Quantas pessoas serao digitadas? ");
            int n = sc.nextInt();
            sc.nextLine();

            char generos[] = new char[n];
            double alturas[] = new double[n];

            for(int i = 0; i < n; i++) {
                System.out.printf("Altura da %da pessoa: ", i + 1);
                alturas[i] = sc.nextDouble();
                System.out.printf("Genero da %da pessoa (F/M): ", i + 1);
                generos[i] = sc.next().charAt(0);
            }

            double maiorAltura = alturas[0];
            double menorAltura = alturas[0];

            for(int i = 0; i < n; i++) {
                if(alturas[i] > maiorAltura) {
                    maiorAltura = alturas[i];
                } if (alturas[i] < menorAltura) {
                    menorAltura = alturas[i];
                }
            }

            int qtdH = 0;
            int qtdM = 0;
            double alturaMulherTotal = 0;

            for(int i = 0; i < n; i++) {
                if (generos[i] == 'm' || generos[i] == 'M') {
                    qtdH++;
                } else if (generos[i] == 'f' || generos[i] == 'F') {
                    qtdM++;
                    alturaMulherTotal += alturas[i];
                }
            }

            double mediaAlturasM = alturaMulherTotal / qtdM;

            System.out.printf("Menor altura = %.2f%n", menorAltura);
            System.out.printf("Maior altura = %.2f%n", maiorAltura);
            System.out.printf("Media das alturas das mulheres: %.2f%n", mediaAlturasM);
            System.out.printf("Numero de homens = %d", qtdH);


            sc.close();
        }
    }
}
