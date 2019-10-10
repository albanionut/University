import java.util.Scanner;

public class sortSelectie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n= ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (int i = 0; i < n - 1; i++) {
			int pozmin = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[pozmin]) {
					pozmin = j;
					
				}
					
			}
			int aux = a[i];
			a[i] = a[pozmin];
			a[pozmin] = aux;
		}
        System.out.println("Vectorul sortat este: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

}
