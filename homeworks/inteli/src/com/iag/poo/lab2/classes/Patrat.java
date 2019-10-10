package com.iag.poo.lab2.classes;

public class Patrat extends FiguraGeometrica {
    private float laturaPatrat;

    public Patrat(String numeFigura, float laturaPatrat) {
        super(numeFigura);
        this.laturaPatrat = laturaPatrat;
    }

    public Patrat() {
        super();
    }

    public float getLaturaPatrat() {
        return laturaPatrat;
    }

    public void setLaturaPatrat(int laturaPatrat) {
        this.laturaPatrat = laturaPatrat;
    }

    public float getArie() {
        return laturaPatrat * laturaPatrat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patrat{");
        sb.append("laturaPatrat=").append(laturaPatrat);
        sb.append('}');
        return sb.toString();
    }
}
