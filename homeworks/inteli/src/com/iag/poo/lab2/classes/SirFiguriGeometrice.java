package com.iag.poo.lab2.classes;

import com.iag.poo.lab2.constante.Constante;

import java.util.Arrays;

public class SirFiguriGeometrice {
    private FiguraGeometrica[] sirFiguri = new FiguraGeometrica[Constante.DIMENSIUNE_SIR];
    private int counter = 0;

    public SirFiguriGeometrice() {
        super();
    }

    public FiguraGeometrica[] getSirFiguri() {
        return sirFiguri;
    }

    public void setSirFiguri(FiguraGeometrica[] sirFiguri) {
        this.sirFiguri = sirFiguri;
        counter = sirFiguri.length;
    }

    public boolean addFigura(FiguraGeometrica figura) {
        if (counter < sirFiguri.length) {
            sirFiguri[counter] = figura;
            counter++;
            return true;
        }
        return false;
    }

    public FiguraGeometrica removeLastFigura() {
        if (counter > 0)
            return sirFiguri[--counter];
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SirFiguriGeometrice{");
        sb.append("sirFiguri=").append(Arrays.toString(sirFiguri));
        sb.append(", counter=").append(counter);
        sb.append('}');
        return sb.toString();
    }
}
