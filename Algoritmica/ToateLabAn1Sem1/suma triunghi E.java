package exercitii;

import java.util.Scanner;

public class ex1 {
	public static int maxim(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int i, j;
		int s = 0;
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		for (i = 1; i <= n - 2; i++)
			for (j = maxim(i + 1, n - i); j <= n - 1; j++)
				s = s + a[i][j];
		System.out.println("Suma elementelor din triunghiul de este este= " + s);

	}

}
