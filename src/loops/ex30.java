package loops;

import java.util.*;

public class ex30 {

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
		
		System.out.println("Quantos alunos?");
		int alunos = sc.nextInt();
		
		double somaGeral = 0;
		
		for(int i = 1; i <= alunos; i++) {
			double somaNotas = 0;
			
			System.out.println("\nAluno " + i + ":");
			
			for(int j = 1; j <= 4; j++) {
				System.out.println("Digite a nota " + j + ":");
				double notas = sc.nextDouble();
				somaNotas += notas;
		
			}
			double media = somaNotas / 4;
			System.out.println("A media do aluno " + i + " é: " + media);
			
			somaGeral += somaNotas;
		}
		
		 double mediaGeral = somaGeral / (alunos * 4); 
	       System.out.println("\nMédia geral da turma: " + mediaGeral);
		sc.close();
	}

}
