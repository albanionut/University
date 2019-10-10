
import java.util.Scanner;

public class Brad{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("n=");
		int n=sc.nextInt();
		int m=0;
		for(int j=0;j<n;j++)
		{
		 for(int i=0;i<n-m;i++)
		   System.out.print(" ");
		     System.out.print("i");
		       System.out.print("|");
		 for(int i=0;i<m*2;i++)
		    System.out.print(" ");
		      System.out.print("|");
		        System.out.print("i");
		           System.out.println();
		m++;
		}
		
			
		
}
    
    
    		
    		
    
    
    		
    
    
    
	}

