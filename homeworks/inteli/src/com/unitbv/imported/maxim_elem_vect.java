package divide_et_impera;

import java.util.Scanner;

public class maxim_elem_vect {
	static int[] a;

	static int maxim(int p, int u) {
		int m;
		if (p == u) {
			return a[p];
		} else {
			m = (p + u) / 2;
			return max((maxim(p, m)), maxim(m + 1, u));

		}
	}

	static int max(int x, int y) {
		if (x < y)
			return y;
		else
			return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i <= n - 1; i++)
			a[i] = sc.nextInt();

		System.out.println(maxim(0, n - 1));

	}

}
