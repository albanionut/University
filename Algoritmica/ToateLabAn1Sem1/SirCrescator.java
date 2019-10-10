package divide_et_impera;

import java.util.Scanner;

public class SirCrescator {
	static int[] a;

	static boolean sort(int p, int u) {
		int m;
		if (p == u) {
			return true;
		} else {
			m = (p + u) / 2;
		}
		return sort(p, m) && sort(m + 1, u) && a[m] <= a[m + 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i <= n - 1; i++)
			a[i] = sc.nextInt();
		System.out.println(sort(0, 1));
	}
??
}
