package numereLv1;

import java.util.Scanner;

public class nNrFibonacii {
	/* Sa se afiseze primii n termeni ai sirului lui Fibonacii */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cate cifre sa se afiseze din sir?");
		int n = sc.nextInt();
		int f1 = 1;
		int f2 = 1;
		int f3;
		System.out.print(f1 + " " + f2 + " ");
		for (int i = 3; i <= n; i++) {
			f3 = f1 + f2;
			System.out.print(f3 + " ");
			f1 = f2;
			f2 = f3;
		}
		sc.close();
	}

}
