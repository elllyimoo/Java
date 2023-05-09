package edu.mde.lab2;

public class Power implements Function {
    private final Function base;
    private final Function exponent;

    public Power(Function base, Function exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public double calculate(double x) {
        return Math.pow(base.calculate(x), exponent.calculate(x));
    }

    @Override
    public Function derivative() {
        return new Product(
                exponent,
                new Power(base, new Difference(exponent, new Const(1))),
                base.derivative()
        );
    }
}