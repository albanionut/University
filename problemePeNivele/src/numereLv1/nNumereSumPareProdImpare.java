package numereLv1;

import java.util.Scanner;

public class nNumereSumPareProdImpare {
	/*
	 * Se citesc n numere intregi. Sa se realizeze suma numerelor pare si produsul
	 * celor impare
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cate numere doriti sa introduceti?: ");
		int n = sc.nextInt();
		int S=0;
		int P=1;
	
		for (int i=0;i<=n-1;i++) {
			int x=sc.nextInt();
			if (x%2==0) S=S+x;
			else P=P*x;
		}
		System.out.println("Suma este: "+S);
		System.out.println("Produsul este: "+P);
		sc.close();

	}

}
