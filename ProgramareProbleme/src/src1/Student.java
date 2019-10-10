package src1;

import java.util.Scanner;

public class Student {
	Scanner sc=new Scanner (System.in);
	public static final double impozit=0.15;
    public String nume;
  public int varsta;
  public double medieBac;
  public Student()
  {
	  System.out.println("Nume=");nume=sc.next();
	  System.out.println("Ani=");varsta=sc.nextInt();
	  System.out.println("medie="); medieBac=sc.nextDouble();
	  
  }
  public void afisare()
  {
 	 System.out.println("Nume="+nume);
 		System.out.println("Ani="+varsta);
 		System.out.println("Medie BAC="+medieBac);
  }
    public static void main(String[] args) 
    {Scanner sc=new Scanner (System.in);
	System.out.print("n=");
	int n=sc.nextInt();
	Student []a=new Student[n];
   for(int i=0;i<n;i++)
	   a[i]=new Student();
   for(int i=0;i<n;i++)
    a[i].afisare();
   sc.close();
    }
    
}
