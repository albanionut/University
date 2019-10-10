
package sort;

import java.util.*;

public class insert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Elements of the array: ");

		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i <= n - 1; i++) {
			int aux = a[i];
			int j = i - 1;

			if (j >= 0 && a[j] > aux) {
				a[j + 1] = a[j];
				j--;

			}
			a[j + 1] = aux;
		}
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
