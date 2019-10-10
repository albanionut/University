package com.unitbv.recursion;

public class UtilsNumberRecursion {

    public UtilsNumberRecursion() {
    }

    public static long sumacifre(int n) {
        if (n == 0) return 0;
        else {
            return n % 10 + sumacifre(n / 10);
        }
    }

    public static long sumacifreimpare(int n) {
        if (n == 0) return 0;
        if ((n % 10) % 2 == 0) {
            return sumacifreimpare(n / 10);
        } else {
            return n % 10 + sumacifreimpare(n / 10);
        }
    }

    public static int numarApatitiiCinN(int n, int c) {
        if (n == 0) return 0;
        if ((n % 10) == c) {
            return 1 + numarApatitiiCinN(n / 10, c);
        } else {
            return numarApatitiiCinN(n / 10, c);
        }
    }

    public static long putereaNaLuiB(int n, int b) {
        if (n == 0)
            return 1;
        else
            return b * putereaNaLuiB(n - 1, b);
    }

    public static int Max(int x, int y) {
        if (x > y) return x;
        else return y;
    }
}
