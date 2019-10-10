package matrici;
/*
 * suma elementelelor
 * pentru elementelor 
 * triunghi E
 */

import java.util.*;

public class triunghiE {
	public static int max(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

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

		int sum = 0;
		for (int i = 1; i <= n - 2; i++) {
			for (int j = max(i + 1, n - i); j <= n - 1; j++) {
				sum += a[i][j];

			}

		}
		System.out.println("Suma este: " + sum);
		sc.close();

	}
}
