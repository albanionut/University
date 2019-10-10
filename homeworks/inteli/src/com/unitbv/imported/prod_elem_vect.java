package divide_et_impera;

import java.util.Scanner;

public class prod_elem_vect {
	static int[] a;

	static int prod(int p, int u) {
		int m;
		if (p == u)
			return a[p];
		else {
			m = (p + u) / 2;
			return prod(p, m) * prod(m + 1, u);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i <= n - 1; i++)
			a[i] = sc.nextInt();

		System.out.println(prod(0, n - 1));

	}

}
