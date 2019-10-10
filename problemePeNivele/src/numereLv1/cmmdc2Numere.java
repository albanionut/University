package numereLv1;
import java.util.Scanner;

public class cmmdc2Numere {
	/* Sa se calculeze cmmdc a doua numere.*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Primul numar");
		int a=sc.nextInt();
		System.out.println("Al doilea numar");
		int b=sc.nextInt();
		while (a!=b) {
			if (a>b) a=a-b;
			else b=b-a;
		}
		System.out.println("Cmmdc="+a);
		sc.close();
		
		

	}

}
