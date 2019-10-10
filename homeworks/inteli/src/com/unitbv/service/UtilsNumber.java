package com.unitbv.service;

public class UtilsNumber {
    public UtilsNumber() {
    }

    /**
     * Return true or false if the number is prim
     *
     * @param x the x
     * @return the boolean
     */
    public boolean prim(int x) {
        if (x == 1) return true;
        if (x == 2) return true;
        for (int i = 1; i < x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public long factorial(int x) {
        if (x == 1) return 1;
        else return x * factorial(x - 1);
    }

    public long fibonacci(int x) {
        if (x <= 1)
            return x;
        else
            return fibonacci(x - 1) + fibonacci(x - 2);
    }


}