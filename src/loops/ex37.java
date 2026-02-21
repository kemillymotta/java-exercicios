package loops;

import java.util.*;

public class ex37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		int qtdAlunos = 0;
		double somaTotalNotas = 0;
		
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("\n1 - Cadastrar notas de alunos");
			System.out.println("2 - Mostrar média da turma");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.print("Quantos alunos existem? ");
				qtdAlunos = sc.nextInt();
				
				somaTotalNotas = 0;
				
				
/*
 for externo: percorre alunos
 for interno: percorre notas
 var dentro do for: reseta
 var fora do for: acumula
*/
				// for para alunos, repete uma vez para cada aluno
				
				for (int i = 1; i <= qtdAlunos; i++) {
					// cada aluno começa com a soma zerada, nao mistura notas de alunos diferentes
					double somaNotasAluno = 0;
					
					System.out.print("Aluno " + i);
					
					// repita 3 vezes para pegar as 3 notas
					for (int j = 1; j <=3; j++) {
						System.out.print("\nDigite a nota " + j + ": ");
						double nota = sc.nextDouble();
						somaNotasAluno += nota;
					}
					
					double mediaAluno = somaNotasAluno / 3;
					System.out.printf("\nMédia do aluno: %.2f\n", mediaAluno);
					
					somaTotalNotas += somaNotasAluno;
				}
			} else if (opcao == 2) {
				
				if (qtdAlunos > 0) {
					double mediaTurma = somaTotalNotas / (qtdAlunos * 3);
					System.out.printf("Média geral da turma: %.2f\n", mediaTurma);
				} else {
					System.out.println("Nenhuma nota cadastrada ainda.");
				}
			} else if (opcao != 0) {
				System.out.println("Opção inválida");
			}

		}while(opcao != 0);
		
		System.out.println("Programa encerrado.");
		sc.close();

	}

}
