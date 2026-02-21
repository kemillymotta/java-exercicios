package loops;

import java.util.*;

public class ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char opcao;
		
		do {
			
			System.out.println("1 - Opção A");
			System.out.println("2 - Opção B");
			System.out.println("0 - Sair");
			opcao = sc.next().charAt(0);
			
		
		switch(opcao) {
		
		case '1':
			System.out.println("Você é do grupo A.");
			break;
		
		case '2':
			System.out.println("Você é do grupo B.");
			break;
		
		case '0':
			System.out.println("Programa encerrado.");
			break;
			
		default:
			System.out.println("Opção inválida, tente novamente.");
		}
			
		}while(opcao != '0');
		
		sc.close();
	}

}
