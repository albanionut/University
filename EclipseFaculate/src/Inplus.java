import java.util.Scanner;

public class Inplus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		System.out.println("introduceti elementele vectorului ");
		for (int i = 0; i <= n - 1; i++)
		{
			a[i] = sc.nextInt();
			b[i] = 0;
			c[i] = a[i];
		}

		for (int i = 0; i <= n - 2; i++) 
		{
			for (int j = i + 1; j <= n - 1; j++) 
			{
				if (a[i] > a[j])
					b[i] = b[i] + 1;
				else
					b[j] = b[j] + 1;
			}
		}

		for (int i = 0; i <= n - 1; i++) {
			a[b[i]] = c[i];
		System.out.print("Vectorul sortat: ");
		}
		for (int i = 0; i <= n - 1; i++)
			System.out.print(a[i] + " ");
		sc.close();
	}
}
