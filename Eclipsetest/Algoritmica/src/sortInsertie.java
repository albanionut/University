import java.util.Scanner;

public class sortInsertie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Elemenul " + i + " este: ");
			a[i] = sc.nextInt();
		}
		for (int i = 1; i < n; i++) {
			int aux = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > aux) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = aux;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");

		}
		sc.close();
	}

}
