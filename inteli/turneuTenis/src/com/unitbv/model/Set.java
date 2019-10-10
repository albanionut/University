package com.unitbv.model;

public class Set {
    private int numarGamesJucator1;
    private int numarGamesJucator2;

    public Set(int numarGamesJucator1, int numarGamesJucator2) {
        this.numarGamesJucator1 = numarGamesJucator1;
        this.numarGamesJucator2 = numarGamesJucator2;
    }

    public int getNumarGamesJucator1() {
        return numarGamesJucator1;
    }

    public void setNumarGamesJucator1(int numarGamesJucator1) {
        this.numarGamesJucator1 = numarGamesJucator1;
    }

    public int getNumarGamesJucator2() {
        return numarGamesJucator2;
    }

    public void setNumarGamesJucator2(int numarGamesJucator2) {
        this.numarGamesJucator2 = numarGamesJucator2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Set{");
        sb.append("numarGamesJucator1=").append(numarGamesJucator1);
        sb.append(", numarGamesJucator2=").append(numarGamesJucator2);
        sb.append('}');
        return sb.toString();
    }
}
