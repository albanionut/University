package matrici;

//Numarul elementelor mai > 5 de pe diagonala secundara

import java.util.Scanner;

public class greaterThanFive {
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

		for (int i = 0; i <= n - 1; i++) {
			if (a[i][n - i - 1] >= 5) {
				counter++;
			}
		}
		System.out.println("Numarul de elemente: " + counter);

		sc.close();
	}

}
