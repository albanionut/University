package divide_et_impera;
import java.util.Scanner;
public class suma_elem_vect {

	static int[] a;

	static int suma(int s, int u) {
		int m;
		if (s == u)
			return a[s];
		else {
			m = (s + u) / 2;
			return suma(s, m) + suma(m + 1, u);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i <= n - 1; i++)
			a[i] = sc.nextInt();

		System.out.println(suma(0, n - 1));

	}

}
