package edu.mde.lab2;

public class Variable implements Function {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double calculate(double x) {
        return x;
    }

    @Override
    public Function derivative() {
        return new Const(1);
    }
}
