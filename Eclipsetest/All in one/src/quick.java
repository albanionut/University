package sort;

import java.util.Scanner;

public class quick {

	static Scanner sc = new Scanner(System.in);

	static int n;
	static int x[];

	static void quickSort(int first, int last) {

		int mid;

		if (first == last) {
			mid = partitioning(first, last);
			quickSort(first, mid);
			quickSort(mid + 1, last);

		}

	}

	static int partitioning(int first, int last) {

		int pivot = x[first];
		int i = first;
		int j = last;
		int aux;

		while (i < j) {
			while (x[i] < pivot) {
				i++;
			}

			while (x[j] > pivot) {
				j--;
			}

			if (i < j) {
				aux = x[i];
				x[i] = x[j];
				x[j] = aux;
				i++;
				j--;
			}

		}

		if (x[j] > pivot) {
			return j - 1;
		} else {
			return j;
		}
	}

	public static void main(String[] args) {

		System.out.println("Length of array: ");
		n = sc.nextInt();
		int[]x = new int[n];

		System.out.println("Elements of array: ");
		for (int i = 0; i <= n - 1; i++) {
			x[i] = sc.nextInt();
		}

		quickSort(0, n - 1);
		
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(x[i] + " ");
		}

	}

}
