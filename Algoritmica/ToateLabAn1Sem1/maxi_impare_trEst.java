package exercitii;

import java.util.Scanner;

public class maxi_impare_trEst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int i, j, x = 0;
		int ok = 0;
		int max = Integer.MIN_VALUE;
		for (i = 0; i < n - 1; i++)
			for (j = 0; j <= n - 1; j++)
				a[i][j] = sc.nextInt();
		for (i = 0; i < n - 1; i++)
			for (j = 0; j <= n - 1; j++) {
				if (i < j && i + j > n - 1)
					a[i][j] = x;
				{
					if (x > max && x % 2 == 1) {
						max = x;
						ok = 1;
					}
				}

			}
		if (ok == 1)
			System.out.println("Maximul din triunghiul de est este= " + max);
		else
			System.out.println("Maximul nu exista");

	}

}
