package com.iag.poo.lab2.classes;

public class FiguraGeometrica {
    private String numeFigura;

    public FiguraGeometrica(String numeFigura) {
        this.numeFigura = numeFigura;
    }

    public FiguraGeometrica() {
        super();
    }

    public String getNumeFigura() {
        return numeFigura;
    }

    public void setNumeFigura(String numeFigura) {
        this.numeFigura = numeFigura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FiguraGeometrica{");
        sb.append("numeFigura='").append(numeFigura).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
