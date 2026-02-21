package loops;

import java.util.*;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fat = 1;
		int n = sc.nextInt();
		
		for(int i = n; i > 1; i--) {
			fat *=i;
			System.out.println(fat);
		}
		
		
		
		sc.close();

	}

}
