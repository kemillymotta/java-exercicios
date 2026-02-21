package loops;

import java.util.*;

public class ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char opcao;
		
		do {
		System.out.println("Digite a temperatura em Celsius: ");
		double c = sc.nextDouble();
		
		double f = ((9 * c) / 5) + 32;
		
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
		
		System.out.println("Deseja repetir (s/n)?");
		opcao = sc.next().charAt(0);
		} while (opcao == 's');
		                         
		sc.close();
	}

}
