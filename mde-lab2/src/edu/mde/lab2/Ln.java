package edu.mde.lab2;

import java.text.NumberFormat;

public class Ln implements Function {

    private final Function arg;
    public Ln(Function arg) {
        this.arg = arg;
    }

    @Override
    public double calculate(double x) {
        return Math.log(arg.calculate(x));
    }

    @Override
    public Function derivative() {
        return new Fraction(arg.derivative(), arg);
    }

    @Override
    public String toPrettyString(NumberFormat format) {
        return "ln(" + arg.toPrettyString(format) + ")";
    }
}