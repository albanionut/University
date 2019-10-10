package sort;

import java.util.*;

public class bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Elements of the array: ");

		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}

		boolean isSorted = true;
		do {
			isSorted = true;
			for (int i = 0; i <= n - 2; i++) {
				if (a[i] > a[i + 1]) {
					int aux = a[i];
					a[i] = a[i + 1];
					a[i + 1] = aux;
					isSorted = false;
				}

			}

		} while (isSorted == false);

		for (int i = 0; i <= n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
