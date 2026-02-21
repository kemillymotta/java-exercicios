package loops;

import java.util.*;

public class ex22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
				
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisão impossivel");
			}
			
			else {
				double div = x/y;
				System.out.println(div);
			}
			
		}
		
		sc.close();
	}

}
