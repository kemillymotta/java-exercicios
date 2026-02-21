package loops;

import java.util.*;

public class ex26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// for (inicio; condição; incremento)
		// inicio: executa somente na primeira vez
		// condição: v = executa e volta, f = pula fora
		// incremento: executa toda vez depois de voltar
		
		
		  int n = sc.nextInt();
		  
		  int soma = 0;
		  
		  for (int i = 0; i < n; i++) { int x = sc.nextInt(); soma += x; }
		  
		  System.out.println(soma);
		  
		 
		
			/*
			 * for (int i = 0; i < 5; i++) { System.out.println("Valor de i: " + i); }
			 */

		sc.close();
	}

}
