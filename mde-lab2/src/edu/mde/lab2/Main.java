package edu.mde.lab2;


public class Main {
    public static void main(String[] args) {
        // ф-ция f1(x)= 2*cos(x)^3-|-3*tg√x|
        Function f1 = new Difference(
                new Product(
                        new Const(2),
                        new Power(
                                new Cos(new Variable("x")),
                                new Const(3)
                        )
                ),
                new Abs(
                        new Negation(
                                new Product(
                                        new Const(3),
                                        new Tan(
                                                new Power(
                                                        new Variable("x"),
                                                        new Const(0.5)
                                                )
                                        )
                                )
                        )
                )
        );

        double x = 0.1;
        System.out.println("f1(" + x + ") = " + f1.calculate(x));
        System.out.println("f1'(" + x + ") = " + f1.derivative().calculate(x));

        // f2(x)=2*x/(ln((x+3)^3))^2
        Function f2 = new Fraction(
                new Product(
                        new Const(2),
                        new Variable("x")
                ),
                new Power(
                        new Ln(
                                new Power(
                                        new Sum(
                                                new Variable("x"),
                                                new Const(3)
                                        ),
                                        new Const(3)
                                )
                        ),
                        new Const(2)
                )
        );
        System.out.println("f2(" + x + ") = " + f2.calculate(x));
        System.out.println("f2'(" + x + ") = " + f2.derivative().calculate(x));
    }
}