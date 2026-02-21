package loops;

import java.util.*;

public class ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int contador = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if (num != 0) {
				contador++;
			}
			
		}while(num != 0);
		
		System.out.println("Números digitados: " + contador);
		sc.close();
	}

}
