package matrici;

//Maximul numerelor negative de sub diagonala secundara
import java.util.*;

public class maxSubDiagSec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Marimea matricii: ");
		int n = sc.nextInt();
		int[][] a = new int[n][n];

		System.out.println("Elementele matricii: ");

		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				a[i][j] = sc.nextInt();

			}
		}

		int max = Integer.MAX_VALUE;
		boolean isMax = false;
		
		for (int i = 1; 1 <= n - 1; i++) {
			for (int j = n - i; j <= n - 1; j++) {
				if (a[i][j] < 0 && a[i][j] > max) {
					max = a[i][j];
					isMax = true;
				}

			}

		}
		if (isMax) {
			System.out.println("Maximul: " + max);
		}
		sc.close();
	}
}
