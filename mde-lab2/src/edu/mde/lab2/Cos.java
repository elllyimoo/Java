package edu.mde.lab2;


public class Cos implements Function {
    private final Function arg;

    public Cos(Function arg) {
        this.arg = arg;
    }

    @Override
    public double calculate(double x) {
        return Math.cos(arg.calculate(x));
    }

    @Override
    public Function derivative() {
        return new Product(
                new Negation(new Sin(arg)),
                arg.derivative()
        );
    }
}