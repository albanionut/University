package exercitii;

import java.util.Scanner;

public class nr_numererotunde_diagsec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int i, j, nr0 = 0, nr1 = 0, nr = 0;
		for (i = 0; i <= n - 1; i++)
			for (j = 0; j <= n - 1; j++)
				a[i][j] = sc.nextInt();
		for (i = 0; i <= n - 2; i++)
			for (j = i + 1; j <= n - 1; j++) {
				int x = a[i][j];
				while (x > 0) {
					if (x % 2 == 0)
						nr0++;
					else
						nr1++;
					x = x / 2;
				}
				if (nr0 == nr1)
					nr++;

			}
		System.out.println("Numarul de numere rotunde de deasupra diagonalei " + " " + nr);
	}

}
