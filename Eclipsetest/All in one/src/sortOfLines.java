package matrici;
/*
 * interschimbam liniile primei 
 * coloane astfel incat
 * elementele promei coloane 
 * sa fie in ordine crescatoare
 */

import java.util.*;

public class sortOfLines {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Linii: ");
		int n = sc.nextInt();

		System.out.println("Coloane: ");
		int m = sc.nextInt();

		int[][] a = new int[n][m];

		System.out.println("Elementele matricii: ");
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= m - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		boolean ok = true;
		do {
			for (int j = 0; j <= m - 2; j++) {
				if (a[0][j] > a[0][j + 1]) {
					for (int i = 0; i <= n - 1; i++) {
						int aux = a[i][j];
						a[i][j] = a[i][j + 1];
						a[i][j + 1] = aux;
						ok = false;
					}
				}

			}

		} while (ok == true);

		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= m - 1; j++) {
				System.out.print(a[i][j]);
			}
		}
		sc.close();
	}
}
