package com.unitbv.model;

import java.util.List;

public class Turneu {
    private List<Jucator> jucatori;
    private List<ScorJoc> jocuri;

    public Turneu(List<Jucator> jucatori, List<ScorJoc> jocuri) {
        this.jucatori = jucatori;
        this.jocuri = jocuri;
    }

    public List<Jucator> getJucatori() {
        return jucatori;
    }

    public void setJucatori(List<Jucator> jucatori) {
        this.jucatori = jucatori;
    }

    public List<ScorJoc> getJocuri() {
        return jocuri;
    }

    public void setJocuri(List<ScorJoc> jocuri) {
        this.jocuri = jocuri;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Turneu{");
        sb.append("jucatori=").append(jucatori);
        sb.append(", jocuri=").append(jocuri);
        sb.append('}');
        return sb.toString();
    }
}
