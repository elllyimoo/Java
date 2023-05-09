package edu.mde.lab2;


public class Const implements Function {
    private final double value;

    public Const(double value) {
        this.value = value;
    }

    @Override
    public double calculate(double x) {
        return value;
    }

    @Override
    public Function derivative() {
        return new Const(0);
    }
}