package edu.mde.lab2;

public class Sign implements Function {
    private final Function arg;

    public Sign(Function arg) {
        this.arg = arg;
    }

    @Override
    public double calculate(double x) {
        double argValue = arg.calculate(x);
        if (argValue > 0) {
            return 1;
        } else if (argValue < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Function derivative() {
        return new Const(0);
    }
}
