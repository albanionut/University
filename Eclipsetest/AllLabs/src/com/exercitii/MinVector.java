package com.exercitii;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class MinVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n=");
        int n =sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        int min= MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
