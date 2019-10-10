package divide_et_impera;

import java.util.Scanner;

public class NrAparitiiX_inVect {
	static int[] a;

	static int aparitii(int p, int u, int x) {
		int m;
		if (p == u) {
			if (a[p] == x)
				return 1;
			else
				return 0;
		} else
			m = (p + u) / 2;
		return aparitii(p, m, x) + aparitii(m + 1, u, x);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i <= n - 1; i++)
			a[i] = sc.nextInt();

		System.out.println(aparitii(0, 1, 2));

	}
}
