package gail;
import java.util.Scanner;


public class Ex12f 
{
	

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double WCI;
		System.out.println("Viteza= ");
		double v = input.nextInt();
		System.out.println("Temperatura= ");
		double t = input.nextDouble();
		
			if (0 <= v && v <= 4)
				WCI = t;
			else{
					if (v >= 45)
							WCI = (double) (1.6 * t - 55);
						else
							WCI = 91.4 + (91.4 - t) * (0.0203 * v - 0.304 * Math.sqrt(v) - 0.474);
				}
			
System.out.println("WCi="+WCI);
input.close();
	}
	
}
