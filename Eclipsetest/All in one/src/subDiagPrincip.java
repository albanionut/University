package matrici;

//Produsul elementelor de sub diagonala principala

import java.util.*;

public class subDiagPrincip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Marimea matricii: ");
		int n = sc.nextInt();
		int[][] a = new int[n][n];

		System.out.println("Elementele matricii: ");

		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				a[i][j] = sc.nextInt();

			}
		}
		int min = Integer.MAX_VALUE;
		boolean isMin = false;

		for (int i = 1; i <= n - 1; i++) {
			for (int j = 0; j <= i - 1; j++) {
				if (a[i][j] > 0 && a[i][j] < min) {
					min = a[i][j];
					isMin = true;
				}

			}
		}
		if (isMin) {
			System.out.println("Minimul: " + min);

		}
		sc.close();
	}
}
