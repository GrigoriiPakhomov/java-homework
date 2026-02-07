package main.java.simpleCalculator;

public class Calculator {
    public static double calculate(double a, double b, Operation operation) {
        return switch (operation) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> a / b;
        };
    }
}
