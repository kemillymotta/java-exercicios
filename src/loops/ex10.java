package loops;

import java.util.*;

public class ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char opcao;
		
	do {
		System.out.println("1 - Mostrar mensagem");
		System.out.println("0 - Sair");
		opcao = sc.next().charAt(0);
		
		if (opcao == '1') {
             System.out.println("Olá, bem-vindo ao programa!\n");
         }
        else if (opcao == '0') {
             System.out.println("Programa encerrado.");
         }
        else {
             System.out.println("ERRO! Digite um número válido.\n");
         }

     } while (opcao != '0');
		
		
		sc.close();
	}

}
