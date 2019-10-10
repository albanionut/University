package exercitii;

import java.util.Scanner;

public class min_elem_triunghiN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int i, j;
		int min = Integer.MAX_VALUE;
		for (i = 0; i <= n - 1; i++)
			for (j = 0; j <= n - 1; j++)
				a[i][j] = sc.nextInt();
		for (i = 0; i <= (n - 1) / 2 - 1; i++)
			for (j = i + 1; j <= n - i - 2; j++)
				if (a[i][j] < min)
					min = a[i][j];
		System.out.println("Minimul din triunghiul de nord este= "+ " "+ min);
	}

}
