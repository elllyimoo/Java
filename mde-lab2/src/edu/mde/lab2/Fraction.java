package edu.mde.lab2;

// Деление
public class Fraction implements Function {
    private final Function numerator;
    private final Function denominator;

    public Fraction(Function numerator, Function denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public double calculate(double x) {
        return numerator.calculate(x) / denominator.calculate(x);
    }

    @Override
    public Function derivative() {
        return new Fraction(
                new Difference(
                        new Product(numerator.derivative(), denominator),
                        new Product(numerator, denominator.derivative())
                ),
                new Power(denominator, new Const(2))
        );
    }

}