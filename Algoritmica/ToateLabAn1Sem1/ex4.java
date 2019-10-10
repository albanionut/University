package exercitii;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		int i, j;
		int[][] a = new int[n][n];
		for (i = 0; i <= n - 1; i++)
			for (j = 0; j <= n - 1; j++)
				a[i][j] = sc.nextInt();
		int ok, aux = 0;
		
		do { ok = 1;
			for (i = 0; i <= n - 2; i++)
				if (a[i][0] < a[i+1][0]) {
					for (j = 0; j <= n - 1; j++) {
						aux = a[i][j];
					a[i][j] = a[i + 1][j];
					a[i + 1][j] = aux;
					}
					ok = 0;
				}

		} while (ok == 0);
		for (i = 0; i <= n - 1; i++) {
			System.out.println();
		
			for (j = 0; j <= n - 1; j++)
				System.out.print(a[i][j] + " ");
		}

	}
}
