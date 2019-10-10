package numereLv1;

import java.util.Scanner;

public class nrPrimDinInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Capatul stang al intervalului:");
		int p = sc.nextInt();
		System.out.println("Capatul drept al intervalului:");
		int q = sc.nextInt();

		for (int i = p; i <= q; i++) {
			int nrd = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j ==0)
					nrd=nrd+1;
			}
			if (nrd==2)
				System.out.print(i+" ");
		}
		sc.close();
	}

}
