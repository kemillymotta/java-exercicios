package loops;

import java.util.*;

public class ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			int tab = n * i;
			System.out.printf("%d x %d = %d\n", n, i, tab);
		}
		
		sc.close();
	}

}
