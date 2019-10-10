package gail;
import java.util.Scanner;

public class Ex13a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the item: ");
		String p =sc.nextLine();
		System.out.println("Enter the price: ");
		double price=sc.nextDouble();
		System.out.println("Overnight delivery (0==no, 1==yes): ");
		int o =sc.nextInt();
		double s=10.00;
		if (s<10.00)  s=2.00;
		if (s>10.00 || s==10.00) s=3.00;
		if (o==1) o=5;
		else o=0;
		
		System.out.println("\n Invoice: ");
		System.out.println(p+"  "+price);
		System.out.println("Shipping:  "+(s+o));
		System.out.println("Total: "+(price+s+o));
		sc.close();
		
		

	}

}
