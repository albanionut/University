package matrici;

//Produsul elementelor de pe diagolana principala

import java.util.*;

public class mainDiag {

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
		int p = 1;
		for (int i = 0; i <= n - 1; i++) {
			p = p * a[i][i];

		}
		System.out.println(p);
		sc.close();
	}

}
