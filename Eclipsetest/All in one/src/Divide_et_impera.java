package matrici;

import java.util.Scanner;

public class Divide_et_impera {

	static Scanner sc = new Scanner(System.in);
	static int a[][];

	public static int prod(int i, int j, int n, int m) {

		if (i == n) {
			return 1;
		} else if (j == m - 1) {

			return a[i][j] * prod(i + 1, 0, n, m);

		} else {

			return a[i][j] * prod(i, j + 1, n, m);

		}
	}

	public static void citMat(int i, int j, int n, int m) {

		if (i < n) {
			a[i][j] = sc.nextInt();

			if (j == m - 1) {
				citMat(i + 1, 0, n, m);
			} else {
				citMat(i, j + 1, n, m);
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Numarul de linii: ");
		int n = sc.nextInt();

		System.out.println("Numarul de coloane: ");
		int m = sc.nextInt();

		a = new int[n][m];

		citMat(0, 0, n, m);
		System.out.println(prod(0, 0, n, m));

	}
	
}
