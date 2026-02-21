package loops;

import java.util.*;

public class ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		int contador = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			soma += num;
			
			if (num != 0) {
				contador++;
			}
			
		}while(num != 0);
		
		if (contador > 0) {
		
		double media = (double) soma / contador;
		System.out.println("A média dos números digitados é: " + media);
		}
		else {
			System.out.println("Nenhum valor foi digitado.");
		}
		
		sc.close();
	}

}
