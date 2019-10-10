package com.unitbv.implement;

import java.util.Scanner;

public class CifrNrMaxAparitii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        int fr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            fr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            fr[x]++;
        }
        int max = Integer.MIN_VALUE;
        int aux = 0;
        for (int i = 0; i < 10; i++) {
            if (fr[i] > max) {
                max = fr[i];
                aux = i;
            }
        }
        System.out.println("Cifra care apare de cele mai multe ori este " + aux);
    }
}
