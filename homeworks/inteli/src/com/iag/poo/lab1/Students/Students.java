package com.iag.poo.lab1.Students;

public class Students {
    public String nume;
    public String prenume;
    public int varsta;

    public Students(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    /**
     * Getter for property 'varsta'.
     *
     * @return Value for property 'varsta'.
     */
    public int getVarsta() {
        return varsta;
    }

    /**
     * Setter for property 'varsta'.
     *
     * @param varsta Value to set for property 'varsta'.
     */
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    /**
     * Getter for property 'prenume'.
     *
     * @return Value for property 'prenume'.
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * Setter for property 'prenume'.
     *
     * @param prenume Value to set for property 'prenume'.
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Students{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}





