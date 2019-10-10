package divide_et_impera;

import java.util.Scanner;

public class SirElemPoz {

	static int[] a;

	static boolean elempoz(int p, int u) {
		int m;
		if (p == u) {
			if (a[p] > 0) {
				return true;
			} else {
				return false;
			}
		} else {
			m = (p + u) / 2;
			return elempoz(p, m) && elempoz(m + 1, u);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i <= n - 1; i++)
			a[i] = sc.nextInt();
		System.out.println(elempoz(0, 1));
	}

}
