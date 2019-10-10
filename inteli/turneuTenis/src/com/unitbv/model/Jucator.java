package com.unitbv.model;

import java.util.List;
import java.util.Objects;

public class Jucator {
    List<Jucator> jucatori;
    private static int id;
    private String nume;
    public boolean status;//true - jucator activ  false-jucator inactiv
    private int idJucator;

    public Jucator(String nume) {
        this.idJucator = id++;
        this.nume = nume;
        this.status = true;
    }

    public int getIdJucator() {
        return idJucator;
    }

    public void setIdJucator(int idJucator) {
        this.idJucator = idJucator;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jucator jucator = (Jucator) o;
        return idJucator == jucator.idJucator;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idJucator);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", idJucator=").append(idJucator);
        sb.append('}');
        return sb.toString();
    }
}
