package main.java.triangleCalculator;

public class TriangleFactory {

    public static Calculator create(
            InputParametr parametr,
            double x,
            double y
    ) {

        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException(
                    "Ошибка: значения должны быть больше нуля."
            );
        }

        // 1. Два катета (a, b)
        if (parametr == InputParametr.TWO_CATHETS) {

            double a = x;
            double b = y;
            double c = Math.sqrt(a * a + b * b);

            return new Calculator(a, b, c);
        }

        // 2. Катет и гипотенуза (a, c)
        else if (parametr == InputParametr.CATHET_AND_HYPOTENUSE) {

            double a = x;
            double c = y;

            if (c <= a) {
                throw new IllegalArgumentException(
                        "Ошибка: гипотенуза должна быть больше катета."
                );
            }

            double b = Math.sqrt(c * c - a * a);
            return new Calculator(a, b, c);
        }

        // 3. Катет и угол (a, alpha)
        else if (parametr == InputParametr.CATHET_AND_ANGLE) {

            double a = x;
            double angle = y;

            if (angle <= 0 || angle >= 90) {
                throw new IllegalArgumentException(
                        "Ошибка: угол должен быть больше 0 и меньше 90 градусов."
                );
            }

            double alpha = Math.toRadians(angle);
            double c = a / Math.sin(alpha);
            double b = Math.sqrt(c * c - a * a);

            return new Calculator(a, b, c);
        }

        // 4. Гипотенуза и угол (c, alpha)
        else if (parametr == InputParametr.HYPOTENUSE_AND_ANGLE) {

            double c = x;
            double angle = y;

            if (angle <= 0 || angle >= 90) {
                throw new IllegalArgumentException(
                        "Ошибка: угол должен быть больше 0 и меньше 90 градусов."
                );
            }

            double alpha = Math.toRadians(angle);
            double a = c * Math.sin(alpha);
            double b = Math.sqrt(c * c - a * a);

            return new Calculator(a, b, c);
        }

        else {
            throw new IllegalArgumentException("Ошибка: неизвестный тип параметров.");
        }
    }
}
