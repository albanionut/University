package divide_et_impera;
import java.util.Scanner;
public class recursive {

	static void transf (int n, int b)
	{
		if (n<b)
			System.out.println("n= "+ n);
		else
			transf(n/b,b);
		System.out.print(n%b + " ");

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("n= ");
		int n=sc.nextInt();
		System.out.println("b= ");
		int b=sc.nextInt();
		transf(n,b);
	
}
}