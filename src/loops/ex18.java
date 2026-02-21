package loops;

import java.util.*;

public class ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("1. Álcool\n2.Gasolina\n3.Diesel\n4.Fim");
		System.out.println();
		System.out.println("Digite sua escolha:");
		int escolha = sc.nextInt();
		
		while (escolha != 4) {
			if (escolha == 1) {
				alcool += 1;
			}
			
			else if (escolha == 2) {
				gasolina += 1;
			}
			
			else if (escolha == 3){
				diesel += 1;
			}
			
			else {
				System.out.println("Inválido! Digite novamente.");
			}
			
			escolha = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADA!");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
		sc.close();
	}

}
