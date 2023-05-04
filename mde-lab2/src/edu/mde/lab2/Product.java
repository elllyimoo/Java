package edu.mde.lab2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Product extends Composite implements Function{
    public Product() {
        super();
    }

    public Product(Function... terms) {
        super(terms);
    }

    public Product(ArrayList<Function> terms) {
        super(terms);
    }

    @Override
    public double calculate(double x) {
        double result = 1.0;
        for (Function function : terms()) {
            result *= function.calculate(x);
        }
        return result;
    }

    @Override
    public Function derivative() {
        final int size = terms().size();
        ArrayList<Function> sumTerms = new ArrayList<>(size);
        ArrayList<Function> productTerms = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Function function = terms().get(j);
                productTerms.add(j == i ? function.derivative() : function);
            }
            sumTerms.add(new Product(productTerms));
            productTerms.clear();
        }
        return new Sum(sumTerms);
    }

    @Override
    public String toPrettyString(NumberFormat nf) {
        final StringJoiner joiner = new StringJoiner("*");
        for (Function function : terms()) {
            joiner.add(function.toPrettyString(nf));
        }
        return joiner.toString();
    }
}