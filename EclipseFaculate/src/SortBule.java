import java.util.Scanner;

public class SortBule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("vector=");

		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		boolean ok ;
		do {
			ok = true;
			for (int i = 0; i <= n - 2; i++) {
				int aux;
				if (a[i] > a[i + 1]) {
					aux = a[i];
					a[i] = a[i + 1];
					a[i + 1] = aux;
					ok = false;
				}
			}
		} while (ok == false);
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(a[i] + " ");
			sc.close();
		}
	}
}
