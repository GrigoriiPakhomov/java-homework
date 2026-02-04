package main.java.triangleCalculator;


public class Calculator {

    private final double a;
    private final double b;
    private final double c;

    public Calculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getAlpha() {
        return Math.toDegrees(Math.asin(a / c));
    }

    public double getBeta() {
        return 90.0 - getAlpha();
    }

    public double getArea() {
        return (a * b) / 2;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
}
