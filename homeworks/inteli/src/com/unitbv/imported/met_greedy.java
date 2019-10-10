package met_greedy;

import java.util.Scanner;

public class met_greedy {

	static void quicksort(int p, int u) {
		int m;
		if (p < u) {
			m = partitionare(p, u);
			quicksort(p, m);
			quicksort(m + 1, u);
		}
	}

	static int[] t;
	static int[] o;

	static int partitionare(int p, int u) {
		int i, j;
		int piv = t[p];
		int aux;
		i = p;
		j = u;
		while (i < j) {
			while (t[i] < piv) {
				i++;
			}
			while (t[j] > piv) {
				j--;
			}
			if (i < j) {
				aux = t[i];
				t[j] = aux;
				aux = o[i];
				o[i] = o[j];
				o[j] = aux;
				i++;
				j--;

			}

		}
		if (t[j] > piv) {
			return j - 1;

		} else
			return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		 t = new int[n];
		 o = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			o[i] = i;
		}
		quicksort(0, n - 1);
		for (int i = 0; i < n; i++)
			System.out.println("Clientul " + o[i] + "cu timpul " + t[i]);
	}
}
