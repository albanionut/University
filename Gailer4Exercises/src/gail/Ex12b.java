package gail;
import java.util.Scanner;

public class Ex12b {
	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("The capacity of the gas tank: ");
	int capacity=input.nextInt();
	System.out.println("Gage reading: ");
	int gage=input.nextInt();
	System.out.println("Miles per gallon: ");
	int miles=input.nextInt();
	int procent=(capacity*gage)/100;
	int gas=procent*miles;
	if (gas < 200) System.out.println("Get gas!");
	else System.out.println("Safe to proceed");
	input.close();
	
	

	}

}
