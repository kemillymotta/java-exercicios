package loops;

import java.util.*;

public class ex34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas?");
		int notasCad = sc.nextInt();
		int somaTotal = 0;
		int mediaSete = 0;
		int menoresSete = 0;

		for(int i = 1; i <= notasCad; i++) {
			double notas = 0;
			
			do {
				System.out.println("Nota: ");
				notas = sc.nextDouble();
				
				if (notas < 0 || notas > 10) {
					System.out.println("NOTA INVALIDA");
				}
				
			}while(notas < 0 || notas > 10);
			
			somaTotal += notas;
			
			if (notas >= 7) {
				mediaSete++;
			} else {
				menoresSete++;
			}	
		}
		
		double media = somaTotal / notasCad;
		System.out.println("Media: " + media);
		System.out.println("Na media/acima da media: " + mediaSete);
		System.out.println("Abaixo da media: " + menoresSete);
		
		sc.close();

	}

}
