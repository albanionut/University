package matrici;
/*
 * Numarul de coloane
 * cu toate elementele
 */

import java.util.*;

public class nrColoaneElemPar {
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

		int counter = 0;
		boolean isEven = false;
		for (int j = 0; j <= n - 1; j++) {
			for (int i = 0; i <= n - 1; i++) {
				if (a[i][j] % 2 == 0) {
					isEven = true;
					break;
				}
				if (isEven == true) {
					counter++;

				}

			}
		}

		System.out.println("Numarul de coloane cu elemente pare este: " + counter);

		sc.close();
	}
}
