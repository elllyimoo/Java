package edu.mde.lab2;


import java.text.NumberFormat;

public class Difference implements Function {
    private final Function left;
    private final Function right;

    public Difference(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(double x) {
        return left.calculate(x) - right.calculate(x);
    }

    @Override
    public Function derivative() {
        return new Difference(left.derivative(), right.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat nf) {
        return null;
    }

}