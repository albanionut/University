package com.exercitii;
import java.util.Scanner;
public class Concat2Vectori {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("n=");
        int n =sc.nextInt();
        System.out.println("m=");
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[n+m];
        int k=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            c[i]=a[i];
            k++;
        }
        for (int i = 0; i <m ; i++) {
            b[i]=sc.nextInt();
            c[k]=b[i];
            k++;
        }
        for (int i = 0; i <k ; i++) {
            System.out.print(c[i]+" ");
        }

    }
}
