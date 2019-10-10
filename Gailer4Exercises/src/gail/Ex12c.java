package gail;
import java.util.Scanner;
public class Ex12c {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the State Fair Pie Eating Contest heavyweight division ");
		System.out.println("Write your weight: ");
		int weight=sc.nextInt() ;
		if (weight<=250 && weight>=30) System.out.println("You are allowed");
		else System.out.println("You aren't allowed");
		sc.close();

	}

}
