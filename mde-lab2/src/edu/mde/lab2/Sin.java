package edu.mde.lab2;

import java.text.NumberFormat;

public class Sin implements Function {
    private final Function arg;

    public Sin(Function arg) {
        this.arg = arg;
    }

    @Override
    public double calculate(double x) {
        return Math.sin(arg.calculate(x));
    }

    @Override
    public Function derivative() {
        return new Product(new Cos(arg), arg.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat format) {
        return "sin(" + arg.toPrettyString(format) + ")";
    }
}