package loops;

import java.util.*;

public class ex32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcao;
		double somaTotal = 0;
		int qtdNotas = 0;
		
		do {
			System.out.println("\n1 - Cadastrar notas");
			System.out.println("2 - Mostrar média");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opção:");
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				
				System.out.println("Quantas notas?");
			    int qtdNotasCad = sc.nextInt();	
			    
				
				for(int i = 1; i <= qtdNotasCad; i++) {
					
					double notas;

					do {
					    System.out.println("Digite a nota " + i + ":");
					    notas = sc.nextDouble();

					    if (notas < 0 || notas > 10) {
					        System.out.println("NOTA INVÁLIDA.");
					    }
					} while (notas < 0 || notas > 10);

					somaTotal += notas;
					qtdNotas++;	
				}
			} else if (opcao == 2) {
				
				if (somaTotal == 0) {
					System.out.println("Nenhuma nota foi cadastrada.");
				}
				else {
					double media = somaTotal / qtdNotas;
					System.out.printf("Média: %.2f\n", media);
				}
				
			}
			
			else if (opcao == 0) {
				System.out.println("PROGRAMA ENCERRADO.");
			}
			
			else {
				System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
			}

		}while(opcao != 0);
		
		sc.close();
	}

}
