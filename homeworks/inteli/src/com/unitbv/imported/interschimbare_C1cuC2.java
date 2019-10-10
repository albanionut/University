package exercitii;

import java.util.Scanner;

public class interschimbare_C1cuC2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		int i, j;
		int aux;
		int[][] a = new int[n + 1][n + 1];
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++)
				a[i][j] = sc.nextInt();
		System.out.print("Prima coloana ce trebuie intersch este" + " " + "C1= ");
		int C1 = sc.nextInt();
		System.out.print("A doua coloana ce trebuie intersch este" + " " + "C2= ");
		int C2 = sc.nextInt();
		for (i = 1; i <= n; i++) {
			aux = a[i][C1];
			a[i][C1] = a[i][C2];
			a[i][C2] = aux;
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++)
				System.out.println(" " + a[i][j]);
		}
	}
}
