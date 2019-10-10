package backtracking;

import java.util.Scanner;

public class horsey {
	static Scanner sc = new Scanner(System.in);

	static int n;
	static int[][] x;
	static int k;

	public static void back(int l, int c, int k) {
		if (cont(l, c)) {
			x[l][c] = k;

			if (k == n*n) {
				retSol();
			} else {
				back(l - 2, c + 1, k + 1);
				back(l - 1, c + 2, k + 1);
				back(l + 1, c + 2, k + 1);
				back(l + 2, c + 1, k + 1);
				back(l + 2, c - 1, k + 1);
				back(l + 1, c - 2, k + 1);
				back(l - 1, c - 2, k + 1);
				back(l - 2, c - 1, k + 1);

			}
			
			x[l][c] = 0;

		}
	}

	public static boolean cont(int l, int c) {

		if (l >= 0 && l < n && c >= 0 && c < n && x[l][c] == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void retSol() {
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				System.out.println(x[i][j]);
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("How big is da board: ");
		n = sc.nextInt();
		x = new int[n][n];
		back(0, 0, 1);

	}
}
