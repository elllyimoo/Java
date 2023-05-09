package edu.mde.lab2;

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
        return new Product(
                arg.derivative(),
                new Cos(arg)
        );
    }
}
