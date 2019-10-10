package gail;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter amount of purchases:");
				int n=sc.nextInt();
				int d=n-(n*10)/100;
				if(n>10)
					System.out.println("discounted price: "+d);
				else System.out.println("Amount of purchase <10 ");
				sc.close();
			}
	
	}


