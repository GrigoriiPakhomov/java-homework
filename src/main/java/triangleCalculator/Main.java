package main.java.triangleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какие параметры известны? \n" +
                "(1-Катеты, 2-Катет и гипотенуза, 3-Катет и угол, 4-Гипотенуза и угол):");
        int choice = scanner.nextInt();
        InputParametr parametr;

        if (choice == 1) {
            parametr = InputParametr.TWO_CATHETS;
        } else if (choice == 2) {
            parametr = InputParametr.CATHET_AND_HYPOTENUSE;
        } else if (choice == 3) {
            parametr = InputParametr.CATHET_AND_ANGLE;
        } else if (choice == 4) {
            parametr = InputParametr.HYPOTENUSE_AND_ANGLE;
        } else {
            System.out.println("Ошибка: выберите число от 1 до 4.");
            return;
        }

        System.out.println("Введите первый параметр:");
        double x = scanner.nextDouble();

        System.out.println("Введите второй параметр:");
        double y = scanner.nextDouble();

        try {
            Calculator calculator = TriangleFactory.create(parametr, x, y);

            System.out.printf(
                    "Расчеты для прямоугольного треугольника:\n" +
                            "Катет a: %.2f\n" +
                            "Катет b: %.2f\n" +
                            "Гипотенуза c: %.2f\n" +
                            "Угол альфа (напротив a): %.2f градусов\n" +
                            "Угол бета (напротив b): %.2f градусов\n" +
                            "Площадь (S): %.2f\n" +
                            "Периметр (P): %.2f\n",
                    calculator.getA(),
                    calculator.getB(),
                    calculator.getC(),
                    calculator.getAlpha(),
                    calculator.getBeta(),
                    calculator.getArea(),
                    calculator.getPerimeter()
            );


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
