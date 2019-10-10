package matrici;

//Numarul elementelor rotunde de deasupra diagonalei secundare

import java.util.*;

public class deasupraDiagSec {
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
		for (int i = 0; i <= n-2; i++) {
			for (int j = 0; j <= n-i-2; j++) {
				if (a[i][j]%2==0) {
					counter++;
				}
			}
		}
		System.out.println("Nunarul de elemente: " + counter);
		
		
		
		sc.close();
	}
}
