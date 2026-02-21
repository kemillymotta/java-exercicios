package loops;

import java.util.*;

public class ex31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * pediu a quantidade de alunos
		 * leu a quantidade de alunos
		 * 
		 * declarou soma geral zerada
		 * 
		 * pra cada aluno, começa no 1, vai ate a quantidade de alunos lida, e adiciona mais 1
		 * 
		 * declara a soma das notas zerada
		 * 
		 * mostra o aluno q vai pedir a nota
		 * 
		 * para cada nota, inicia na nota 1, e pede ate a nota 2, adiciona 1 nota pra cada
		 * aparece digite a nota tal
		 * le a nota
		 * acumula as notas digitadas
		 * 
		 * declara a media
		 * imprime a media
		 * 
		 * acumula as soma na soma geral
		 * 
		 * declara media geral
		 * 
		 * imprime media geral
		 * */
		
		System.out.println("Quantos vendedores?");
		int vendedores = sc.nextInt();
		
		double somaGeral = 0;
		double venda = 0;
		
		for(int i = 1; i <= vendedores; i++) {
			double somaVendas = 0;
			
				System.out.println("\nVendedor " + i);
				
				for(int j = 1; j <= 3; j++) {
					System.out.println("Digite o valor de venda " + j + ":");
					venda = sc.nextDouble();
					
					somaVendas += venda;
									
				}
				System.out.println("Total de vendas pelo vendedor " + i + ": " + somaVendas);
				somaGeral += somaVendas;
		
		} 
		
		double media = somaGeral / (vendedores * 3);
		System.out.println("Média geral de vendas: " + media);
	
		
		
		sc.close();
	}

}
