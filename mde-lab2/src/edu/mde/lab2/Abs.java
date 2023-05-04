package edu.mde.lab2;
import java.text.NumberFormat;

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
        return new Fraction(
                new Product(arg, new Sign(arg)),
                new Abs(arg)
        );
    }

    @Override
    public String toPrettyString(NumberFormat format) {
        return "|" + arg.toPrettyString(format) + "|";
    }}