package com.exercitii;
import java.util.Scanner;
public class AintersectatCuB {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("n=");
        int n =sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int j = 0; j <n ; j++) {
            b[j]=sc.nextInt();
        }
        int nr=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(a[i]==b[j]){
                    c[nr]=a[i];
                    nr++;
                }
            }
        }
        for (int i = 0; i <nr ; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
