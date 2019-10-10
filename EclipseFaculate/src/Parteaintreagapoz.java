import java.util.Scanner;
public class Parteaintreagapoz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("x=");
		double x =sc.nextDouble();
		int p=0;
		while (x>=p+1)
		
		p++;
		
		System.out.print("Partea intreaga a lui x este "+p);
		sc.close();

	}

}
