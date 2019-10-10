package gail;
import java.util.Scanner;
public class Ex12a 
{

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
		        
				final int boltPrice = 5;
				System.out.print("Number of bols: ");
				int b = sc.nextInt();
				
				final int nutPrice = 3;
			    System.out.print("Number of nuts: ");
			    int n = sc.nextInt();
				
			    final int washerPrice = 1;
				System.out.print("Number of washers: ");
				int w = sc.nextInt();
				
				
				int s = 0;
				if(n >= b) 
					{
					s=boltPrice*b+nutPrice*n+washerPrice*w;
					System.out.println("Order is OK"  );
					System.out.println("\n Total cost: "+ s);
					}
				else 
					{
					s=boltPrice*b+nutPrice*n+washerPrice*w;
					System.out.println("Check the Order: too few nuts");
					System.out.println("\n Total cost: "+ s);
					}

				sc.close();
			}

	}

