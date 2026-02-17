package main.java.simpleCalculator;

public enum Operation {

    ADD {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },

    SUBTRACT {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },

    MULTIPLY {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },

    DIVIDE {
        @Override
        public double apply(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Деление на 0 недопустимо!");
            }
            return a / b;
        }
    };

    public abstract double apply(double a, double b);

    public static Operation fromString(String op) {
        return switch (op) {
            case "+" -> ADD;
            case "-" -> SUBTRACT;
            case "*" -> MULTIPLY;
            case "/" -> DIVIDE;
            default -> throw new IllegalArgumentException(
                    "Ошибка: выберите операцию из списка (+, -, *, /)"
            );
        };
    }
}
