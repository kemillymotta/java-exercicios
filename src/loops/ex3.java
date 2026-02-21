package loops;

import java.util.*;

public class ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		for(int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}		
	
		sc.close();
	}

}
