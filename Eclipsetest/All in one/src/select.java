package sort;

import java.util.*;

public class select {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Elements of array: ");
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i <= n - 1; i++) {
			int pozMin = i;
			for (int j = i + 1; j <= n - 1; j++) {
				if (a[j] > a[pozMin]) {
					pozMin = j;
				}
			}
			int aux = a[pozMin];
			a[pozMin] = a[i];
			a[i] = aux;
		}
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
