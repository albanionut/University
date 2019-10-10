package greedy;

import java.util.Scanner;

public class backPack {

	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[] weight;
	static int[] utility;
	static int[] efficiency;
	static int[] object;

	public static void quickSort(int first, int last) {

		int mid;

		if (first < last) {
			mid = partition(first, last);
			quickSort(first, mid);
			quickSort(mid + 1, last);

		}

	}

	public static int partition(int first, int last) {
		int piv = efficiency[first];
		int i = first;
		int j = last;
		int aux;

		while (i < j) {

			while (efficiency[i] > piv) {
				i++;
			}

			while (efficiency[j] < piv) {
				j--;
			}

			if (i < j) {

				aux = efficiency[i];
				efficiency[i] = efficiency[j];
				efficiency[j] = aux;

				aux = object[i];
				object[i] = object[j];
				object[j] = aux;

				aux = weight[i];
				weight[i] = weight[j];
				weight[j] = aux;

				aux = utility[i];
				utility[i] = utility[j];
				utility[j] = aux;

				i++;
				j--;
			}

		}

		if (efficiency[j] < piv) {
			return j - 1;
		}
		return j;
	}

	public static void main(String[] args) {

		System.out.println("Enter number of objects: ");
		n = sc.nextInt();
		int[] weight = new int[n];
		int[] utility = new int[n];
		int[] efficiency = new int[n];
		int[] object = new int[n];

		System.out.println("Enter the max weight: ");
		int maxWeight = sc.nextInt();
		System.out.println("Enter the items weight and utility: ");
		for (int i = 0; i <= n - 1; i++) {
			weight[i] = sc.nextInt();
			utility[i] = sc.nextInt();
			efficiency[i] = utility[i] / weight[i];
			object[i] = i;

		}

		quickSort(0, n - 1);
		int maxUtility = 0;
		int i = 0;

		while (maxWeight > 0 && i < n) {

			if (weight[i] <= maxWeight) {

				System.out.println(object[i] + "was taken as a whole");
				maxUtility += utility[i];
				maxWeight = maxWeight - weight[i];
				i++;

			} else {
				System.out.println(maxWeight / weight[i] + " of the object " + object[i] + " was taken");
				maxUtility += maxWeight / weight[i] * utility[i];
				maxWeight = 0;

			}
		}

		System.out.println("Utility: " + maxUtility);

	}

}
