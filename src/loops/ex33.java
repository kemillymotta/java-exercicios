package loops;

import java.util.*;

public class ex33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de atletas: ");
        int atletas = sc.nextInt();
        
        double somaGeral = 0;
        int atletasAprov = 0;
        
        for (int i = 1; i <= atletas; i++) {
            double somaNotas = 0;

            System.out.println("\nAtleta " + i + ":");

            for (int j = 1; j <= 3; j++) {
                System.out.println("Digite a nota " + j + ":");
                double nota = sc.nextDouble();
                somaNotas += nota;
                somaGeral += nota;
            }

            double media = somaNotas / 3;
            System.out.printf("A média do atleta %d é: %.2f\n", i, media);
            
            if (media >= 7) {
            	atletasAprov++;
            }
        }

        double mediaGeral = somaGeral / (atletas * 3);
        System.out.printf("\nA média geral é: %.2f", mediaGeral);

        System.out.println("\nQuantidade de atletas aprovados: " + atletasAprov);
        sc.close();
    }
}
