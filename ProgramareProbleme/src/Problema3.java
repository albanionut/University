import java.util.Scanner;

public class Problema3 
{

	public static void main(String[] args) 
	{
		Scanner user_input = new Scanner(System.in);
		System.out.print("n=");
		int n = user_input.nextInt();
		int s = 0;
		for (int i = 1; i <= n; i++)
			s = s + i;
		System.out.print("Suma este: " + s);
		user_input.close();
	}

}
