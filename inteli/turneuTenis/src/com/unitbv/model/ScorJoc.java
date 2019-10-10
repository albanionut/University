package com.unitbv.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScorJoc {
    private Joc joc;
    private List<Set> sets;//trebuie facute methode de add si remove

    public ScorJoc(Joc joc, List<Set> sets) {
        this.joc = joc;
        this.sets = sets;
    }

    public Joc getJoc() {
        return joc;
    }

    public void setJoc(Joc joc) {
        this.joc = joc;
    }

    public List<Set> getSets() {
        return sets;
    }

    public void setSets(List<Set> sets) {
        this.sets = sets;
    }

    public boolean addSet(Set set){
        if(set!=null){
            if(sets==null)
                sets=new ArrayList<>();
            if (sets.size()<3)
               return sets.add(set);
        }
       return false;
    }

    public boolean removeSet(Set set){
        if (set!=null)
            if (set!=null)
            return sets.remove(set);
        return false;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ScorJoc{");
        sb.append("joc=").append(joc);
        sb.append(", sets=").append(sets);
        sb.append('}');
        return sb.toString();
    }
}
