package exercitii;

import java.util.Scanner;

public class ex2 {
	public static int minim(int x, int y) {
		if (x < y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int p = 1;
		int i, j;
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		for (i = 1; i <= n - 2; i++)
			for (j = 0; j <= minim(i - 1, n - i - 2); j++)
				p = p * a[i][j];
		System.out.println("Produsul elementelor din triunghiul de veste este= " + p);
	}

}
