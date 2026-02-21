package loops;

import java.util.*;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			
            System.out.println(numero + " x " + i + " = " + (numero * i));		}
		
		sc.close();
	}

}
