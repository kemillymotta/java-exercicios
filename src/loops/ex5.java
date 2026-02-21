package loops;

import java.util.*;

public class ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int cont = 0;
		
		int num = sc.nextInt();
		
		while (num != 0) {
			soma += num;
			cont++;
			
		num = sc.nextInt();
		}
		
		if (cont > 0) {
			double media = (double) soma / cont;
		System.out.println(media);
		}
		sc.close();
	}

}
