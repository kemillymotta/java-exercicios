package loops;

import java.util.*;

public class ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		System.out.println("Digite sua senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida. \nDigite novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido.");
		sc.close();
	}

}
