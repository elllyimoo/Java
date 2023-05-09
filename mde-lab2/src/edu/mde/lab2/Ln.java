package edu.mde.lab2;

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
}
