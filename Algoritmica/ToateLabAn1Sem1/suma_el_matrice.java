package divide_et_impera;

import java.util.Scanner;

public class suma_el_matrice {

	static int[][] a;
	static int m;

	static int sumael(int p, int u) {

		int mij;
		if (p == u)
			return a[p / m][p % m];

		else {
			mij = (p + u) / 2;
			return sumael(p, mij) + sumael(mij + 1, u);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		System.out.print("m= ");
		m = sc.nextInt();
		a = new int[n][m];
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= m - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println(sumael(0, (n - 1) * m + m - 1));
	}

}
