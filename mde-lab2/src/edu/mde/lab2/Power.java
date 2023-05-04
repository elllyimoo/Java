package edu.mde.lab2;

import java.text.NumberFormat;

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
                new Power(base, new Difference(exponent, new Const(1))),
                new Sum(
                        new Product(exponent, base.derivative(), new Ln(base)),
                        new Product(exponent.derivative(), new Ln(base), base)
                )
        );
    }

    @Override
    public String toPrettyString(NumberFormat nf) {
        return null;
    }


}