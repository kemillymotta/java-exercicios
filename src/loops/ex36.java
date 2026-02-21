package loops;

import java.util.*;

public class ex36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcao;
		int qtdFuncionarios = 0;
		int somaTotal = 0;
		
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Cadastrar avaliações");
			System.out.println("2 - Mostrar média geral das avaliações");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.print("Escolha a sua opção: ");
			System.out.println();
			opcao = sc.nextInt();
			
		
				if (opcao == 1 ) {
					System.out.print("Quantos funcionários existem? ");
					qtdFuncionarios = sc.nextInt();
					
					somaTotal = 0;
					
					for(int i = 1; i <= qtdFuncionarios; i++) {
						double somaAvaliFunc = 0;
						
						System.out.println("\nFuncionário " + i + ":");
						
						for(int j = 1; j <= 4; j++) {
							double nota;;
							
							do {
						        System.out.print("Digite a nota " + j + ": ");
						        nota = sc.nextDouble();
						        
						        if(nota > 10 || nota < 0) {
									System.out.println("NOTA INVÁLIDA. DIGITE NOVAMENTE");
								}
							} while (nota < 0 || nota > 10);
							
							somaAvaliFunc += nota;
							
						} 
						double mediaFunci = somaAvaliFunc / 4;
						System.out.println("Média do funcionário: " + mediaFunci);
						
						somaTotal += somaAvaliFunc;
							
					}
				} else if (opcao == 2) {
					 
						if (qtdFuncionarios > 0) {
							double mediaFunc = somaTotal / (qtdFuncionarios * 4);
							System.out.printf("Média geral dos funcionários: %.2f\n", mediaFunc);
						}else {
							System.out.println("Nenhuma nota cadastrada.");
						}
				} else if (opcao != 0) {
					System.out.println("Opção inválida.");
				}


		}while(opcao != 0);
		
		System.out.println("PROGRAMA ENCERRADO.");
		
		sc.close();
	}

}
