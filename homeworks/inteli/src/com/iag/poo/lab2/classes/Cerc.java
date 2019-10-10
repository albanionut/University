package com.iag.poo.lab2.classes;

public class Cerc extends FiguraGeometrica {
    private float razaCerc;

    public Cerc(String numeFigura, int razaCerc) {
        super(numeFigura);
        this.razaCerc = razaCerc;
    }

    public Cerc() {
        super();
    }

    public float getRazaCerc() {
        return razaCerc;
    }

    public void setRazaCerc(int razaCerc) {
        this.razaCerc = razaCerc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cerc{");
        sb.append("razaCerc=").append(razaCerc);
        sb.append('}');
        return sb.toString();
    }

    public float getAria() {
        return (float) (Math.PI * razaCerc * razaCerc);
    }
}
