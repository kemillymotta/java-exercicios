package ExArrays;

import java.util.*;

public class Alturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa%n", i+1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        int menores = 0;
        double alturaTotal = 0, percentualMenores = 0;

        for(int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                menores++;
            }

            alturaTotal += altura[i];
            percentualMenores = ((double)menores / n) * 100;
        }

        double mediaAltura = alturaTotal / n;

        System.out.printf("\nAltura media = %.2f%n", mediaAltura);
        System.out.printf("Pessoas com medos de 16 anos: %.1f%%\n", percentualMenores);

        for(int i = 0; i <n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }

        sc.close();
    }
}
