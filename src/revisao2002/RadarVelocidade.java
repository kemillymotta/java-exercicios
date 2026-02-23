package revisao2002;

import java.util.*;
public class RadarVelocidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            int carros[] = new int[10];

            int soma = 0, contador = 0, maior = 0;

            for(int i = 0; i < 10; i++) {
                carros[i] = sc.nextInt();

                soma += carros[i];

                if(carros[i] > maior) {
                    maior = carros[i];
                }

                if(carros[i] > 80) {
                    contador++;
                }

            }

            double media = (double)soma / 10;

            System.out.printf("Média: %d%n", media);
            System.out.printf("Acima de 80: %d%n", contador);
            System.out.printf("Maior: %d", maior);
            sc.close();
        }
    }
}
