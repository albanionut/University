package exercitii;

import java.util.Scanner;

public class linie_cu_cele_mai_multe_elem_pare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print("m=");
		int m = sc.nextInt();

		int i, j, nr, k = 0;

		int nrmax = Integer.MIN_VALUE;
		int[][] a = new int[n][m];
		for (i = 0; i <= n - 1; i++)
			for (j = 0; j <= m - 1; j++)
				a[i][j] = sc.nextInt();
		for (j = 0; j <= m - 1; j++) {
			nr = 0;
			for (i = 0; i <= n - 1; i++) {
				if (a[i][j] % 2 == 0)
					nr++;

				if (nr > nrmax) {
					nrmax = nr;
					k = i;

				}
			}

		}

		for (j = 0; j <= m - 1; j++)
			System.out.println("  " + a[k][j]);
		System.out.println();
	}

}
