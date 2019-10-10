package exercitii;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("n=");
			int n = sc.nextInt();
			int[] a = new int[n];
			System.out.println("vectorul este: ");
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int ok;
			do {
				ok = 1;
				for (int i = 0; i <= n - 2; i++)
					if (a[i] > a[i + 1]) {
						int aux = a[i];
						a[i] = a[i + 1];
						a[i + 1] = aux;
						ok = 0;
					}
			} while (ok == 0);

			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
		}
	}
}
