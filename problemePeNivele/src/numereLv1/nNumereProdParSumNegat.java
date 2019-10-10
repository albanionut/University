package numereLv1;
import java.util.Scanner;


public class nNumereProdParSumNegat {
	/*Sa se citeasca n numere si sa se calculeze 
	 * produsul numerelor pare si suma numerelor negative */
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Cate numere doriti sa introduceti?:");
		int n=sc.nextInt();
		int x;
		int S=0;
		int P=1;
		for(int i=0;i<=n-1;i++) {
			x=sc.nextInt();
			if (x % 2==0)
				S+=x;
			if (x<0)
				P=P*x;
		}
		System.out.println("Suma este:"+S);
		System.out.println("Produsul este:"+P);
		
	sc.close();	
	}

	
}
