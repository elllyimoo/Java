package edu.mde.lab2;

public class Tan implements Function {
    private final Function arg;
    public Tan(Function arg) {
        this.arg = arg;
    }

    @Override
    public double calculate(double x) {
        return Math.tan(arg.calculate(x));
    }

    @Override
    public Function derivative() {
        return new Fraction(arg.derivative(), new Power(new Cos(arg), new Const(2)));
    }
}