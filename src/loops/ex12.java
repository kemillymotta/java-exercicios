package loops;

import java.util.*;

public class ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i = 1; i < 6; i++) {
			System.out.println("Digite o numero " + i + ":");
			int num = sc.nextInt();
			soma += num;
		}
		
		System.out.println("O total da soma é: " + soma);
		sc.close();
	}

}

