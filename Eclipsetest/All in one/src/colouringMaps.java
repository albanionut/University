package backtracking;

import java.util.Scanner;

public class colouringMaps {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int m;
	static int[] x;
	static int[][] v;
	static int cul[];
	static int k;

	public static void back() {
		for (int i = 0; i <= n - 1; i++) {

			x[i] = -1;
		}

		k = 0;

		while (k >= 0) {

			if (k == n) {
				retSol();
			} else if (x[k] < m - 1) {
				x[k] = x[k] + 1;
				if (cont(k)) {
					k++;
				}
			} else {
				x[k] = -1;
				k--;
			}

		}

	}

	public static void retSol() {
		for (int i = 0; i <= n - 1; i++) {
			System.out.println("Country " + i + "coloured with " + cul[x[i]]);
		}

	}

	public static boolean cont(int k) {

		for (int i = 0; i <= k - 1; k--) {
			if (v[i][k] == 1 && x[i] == x[k]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println("n: ");
		n = sc.nextInt();
		System.out.println("m: ");
		m = sc.nextInt();
		
		v = new int[n][m];
		
		for (int i = 0; i <= n - 2; i++) {
			for (int j = i + 1; j <= n - 1; j++) {
				v[i][j] = sc.nextInt();

			}
		}

		cul = new int[m];
		
		for (int i = 0; i <= m - 1; i++) {
			cul[i] = sc.nextInt();
		}

	}
}
