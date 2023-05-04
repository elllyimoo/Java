package edu.mde.lab2;

import java.text.NumberFormat;

public class Negation implements Function {
    private final Function arg;
    public Negation(Function arg) {
        this.arg = arg;
    }

    @Override
    public double calculate(double x) {
        return -arg.calculate(x);
    }

    @Override
    public Function derivative() {
        return new Negation(arg.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat format) {
        return "-(" + arg.toPrettyString(format) + ")";
    }
}