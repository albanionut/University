package com.exercitii;
import java.util.Scanner;

public class PozXinVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n=");
        int n =sc.nextInt();
        System.out.println("x=");
        int x =sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(a[i]==x){
                System.out.println("Pozitia lui x este "+i );
            }
        }
    }
}
