package exercitii;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		int i, j;
		int[][] a = new int[n][n];
		for (i = 0; i <= n - 1; i++)
			for (j = 0; j <= n - 1; j++)
				a[i][j] = sc.nextInt();
		int nr = 0;
		for (j = 0; j <= n - 1; j++) {
			boolean ok = true;
			for (i = 0; i <= n - 1; i++)
				if (a[i][j] % 2 != 0)
					ok = false;
			if (ok == true)
				nr++;

		}
		System.out.println("Numarul de coloane cu toate elementele pare= " + nr);
	}
}
