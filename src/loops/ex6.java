package loops;

import java.util.*;

public class ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
/*
Mostre um menu e peça a opção ao usuário (use do while):

1 → Cadastrar notas de alunos

2 → Mostrar a média da turma

0 → Sair

Para a opção 1:

Peça quantos alunos existem.

Para cada aluno, peça 3 notas (use for).

Armazene a soma das notas de todos os alunos.

Para a opção 2:

Calcule e mostre a média geral da turma.

O programa só termina quando o usuário escolher 0.
 */
		
int opcao;
double somaNotas = 0;
int totalNotas = 0;

do {
	System.out.println("1 - Cadastrar notas de alunos");
	System.out.println("2 - Mostrar a média da turma");
	System.out.println("0 - Sair");
	System.out.println();
	System.out.println("Escolha uma opção:");
	
	opcao = sc.nextInt();
	
	switch(opcao) {
	case 1: 
		System.out.println("Quantos alunos?");
		int alunos = sc.nextInt();
		
		for(int i = 1; i <= alunos; i++) {
			System.out.println("Aluno " + i + ":");
			
			for(int j = 1; j <= 3; j++) {
				System.out.println("Nota " + j + ":");
				double notas = sc.nextDouble();
				somaNotas += notas;
				totalNotas++;
			}
		}
		break;
		
	case 2: 
		if (totalNotas == 0) {
			System.out.println("Nenhuma nota cadastrada ainda.");
		}
		else {
			double media = somaNotas / totalNotas;
			System.out.printf("Média da turma: %.1f\n", media);
		}
	break;
	
	case 0:
		System.out.println("Programa encerrado.");
	break;
	
		default:
			System.out.println("Erro! Digite uma opção válida.");
	}
}while(opcao != 0);
		
		sc.close();
	}

}
