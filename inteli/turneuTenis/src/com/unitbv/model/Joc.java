package com.unitbv.model;

import java.util.List;

public class Joc {
    private static int id;
    private final Jucator jucator1;
    private final Jucator jucator2;
    private final String tur;
    private int idJucator;

    public Joc(Jucator jucator1, Jucator jucator2, String tur) {
        this.jucator1 = jucator1;
        this.jucator2 = jucator2;
        this.tur = tur;
        this.idJucator = id++;//la fiecare joc se incrementeaza valoarea id ului cu 1 .
    }

    public Jucator getJucator1() {
        return jucator1;
    }

    public Jucator getJucator2() {
        return jucator2;
    }

    public String getTur() {
        return tur;
    }

    public int getIdJucator() {
        return idJucator;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Joc{");
        sb.append("jucator1=").append(jucator1);
        sb.append(", jucator2=").append(jucator2);
        sb.append(", tur='").append(tur).append('\'');
        sb.append(", idJucator=").append(idJucator);
        sb.append('}');
        return sb.toString();
    }
}
