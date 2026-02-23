package revisao2002.application;

import java.util.*;

public class ProdutosProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos? ");
        int n = sc.nextInt();

        String nome[] = new String[n];
        double preco[] = new double[n];
        int qtd[] = new int[n];

        double soma = 0;
        int maisCaro = 0;

        for(int i = 0; i < n; i++) {

            System.out.print("Nome: ");
            nome[i] = sc.next();

            System.out.print("Preço: ");
            preco[i] = sc.nextDouble();

            System.out.print("Quantidade: ");
            qtd[i] = sc.nextInt();

            double valorUni = preco[i] * qtd[i];
            soma += valorUni;

            if(preco[i] > preco[maisCaro]) {
                maisCaro = i;
            }
        }

        System.out.printf("Valor total: %.2f%n", soma);
        System.out.printf("Produto mais caro: %s%n", nome[maisCaro]);

        sc.close();
    }
}