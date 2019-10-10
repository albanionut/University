package backtracking;

import java.util.Scanner;

public class produs_cartezian {
	static int[] x;

	static void back() {
		for (int i = 0; i < x.length; i++) {
			x[i] = 0;
		}
		int k = 0;
		while (k >= 0) {
			if (k == x.length) {
				retsol();
				k = k - 1;
			} else if (x[k] < x.length - 1) {
				x[k] = x[k] + 1;
				k = k + 1;
			} else
				x[k] = 0;
			k = k - 1;
		}
	}

	static void retsol() {
		for (int i = 0; i < x.length - 1; i++)
			System.out.println(x[i]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		x = new int[n];
		System.out.println("Vectorul citit: ");
		for (int i = 0; i <= n - 1; i++)
			x[i] = sc.nextInt();
		back();
	}

}
