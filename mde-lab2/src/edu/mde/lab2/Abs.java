package edu.mde.lab2;

public class Abs implements Function {
    private final Function arg;
    public Abs(Function arg) {
        this.arg = arg;
    }

    @Override
    public double calculate(double x) {
        return Math.abs(arg.calculate(x));
    }

    @Override
    public Function derivative() {
        return new Product(arg.derivative(), new Sign(arg));
    }
}