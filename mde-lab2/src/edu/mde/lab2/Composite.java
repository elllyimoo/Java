package edu.mde.lab2;

import java.util.ArrayList;



public abstract class Composite {
    private final ArrayList<Function> terms = new ArrayList<>();

    public Composite() {
    }

    public Composite(Function... terms) {
        for (Function term : terms) {
            this.terms.add(term);
        }
    }

    public Composite(ArrayList<Function> terms) {
        this.terms.addAll(terms);
    }

    public ArrayList<Function> terms() {
        return terms;
    }

    public void add(Function function) {
        terms.add(function);
    }
}