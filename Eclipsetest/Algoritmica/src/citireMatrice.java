import java.util.Scanner;

public class citireMatrice {
	public static Scanner sc;

	public static void citire(int a[][], int m, int n, int i, int j) {

		if (i < m)
			if (j == n)
				citire(a, m, n, i + 1, 0);
			else {
				a[i][j] = sc.nextInt();
				citire(a, m, n, i, j + 1);
			}

	}

	public static void afisare(int a[][], int m, int n, int i, int j) {

		if (i < m)
			if (j == n) {
				System.out.println();
				afisare(a, m, n, i + 1, 0);

			} else {
				System.out.print(a[i][j] + " ");
				
				afisare(a, m, n, i, j + 1);
			}

	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int m;
		m = sc.nextInt();
		int n;
		n = sc.nextInt();

		int a[][] = new int[m][n];
		citire(a, m, n, 0, 0);
		afisare(a, m, n, 0, 0);

		sc.close();

	}

}
