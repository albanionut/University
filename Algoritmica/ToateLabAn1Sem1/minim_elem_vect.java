package divide_et_impera;
import java.util.Scanner;
	public class minim_elem_vect {
		static int[] a;

		static int minim(int p, int u) {
			int m;
			if (p == u) {
				return a[p];
			} else {
				m = (p + u) / 2;
				return min((minim(p, m)), minim(m + 1, u));

			}
		}

		static int min(int x, int y) {
			if (x < y)
				return x;
			else
				return y;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("n= ");
			int n = sc.nextInt();
			a = new int[n];
			for (int i = 0; i <= n - 1; i++)
				a[i] = sc.nextInt();

			System.out.println(minim(0, n - 1));

		}

	}