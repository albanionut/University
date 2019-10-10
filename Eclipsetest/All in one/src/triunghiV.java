package matrici;

/*
 * Produsul elementelor
 * triunghi de vest
 */
import java.util.*;

public class triunghiV {
	public static int min(int x, int y) {
		if (x < y) {
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

		int prod = 1;
		for (int i = 1; i <= n - 2; i++) {
			for (int j = 0; j <= min(i - 1, n - i - 2); j++) {
				prod *= a[i][j];
			}
		}

		System.out.println("Produsul este: " + prod);
		sc.close();
	}

}
