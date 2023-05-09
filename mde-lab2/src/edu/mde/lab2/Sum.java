package edu.mde.lab2;
import java.util.ArrayList;
public class Sum extends Composite implements Function {
    public Sum() {
        super();
    }

    public Sum(Function... terms) {
        super(terms);
    }

    public Sum(ArrayList<Function> terms) {
        super(terms);
    }

    @Override
    public double calculate(double x) {
        double result = 0.0;
        for (Function function : terms()) {
            result += function.calculate(x);
        }
        return result;
    }

    @Override
    public Function derivative() {
        final int size = terms().size();
        ArrayList<Function> derivatives = new ArrayList<>(size);
        for (Function function : terms()) {
            derivatives.add(function.derivative());
        }
        return new Sum(derivatives);
    }
}
