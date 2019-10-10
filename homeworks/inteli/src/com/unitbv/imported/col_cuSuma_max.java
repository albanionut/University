package exercitii;

import java.util.Scanner;

public class col_cuSuma_max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print("m=");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int i, j, s, k = 0;
		int smax = Integer.MIN_VALUE;
		for (i = 0; i <= n - 1; i++)
			for (j = 0; j <= m - 1; j++)
				a[i][j] = sc.nextInt();
		for (i = 0; i <= n - 1; i++) {
			s = 0;
			for (j = 0; j <= m - 1; j++) {

				s = s + a[i][j];
				if (s > smax) {
					smax = s;
					k = j;
				}

			}

		}
		for (i = 0; i <= n - 1; i++)
			System.out.println(" " + a[i][k]);
	}
}
