package main.java.simpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите число.");
            return;
        }
        double firstNumber = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Введите операцию (+, -, \\*, /):");
        String inputOperation = scanner.nextLine();

        Operation operation;
        switch (inputOperation){
            case "+" -> operation = Operation.ADD;
            case "-" -> operation = Operation.SUBTRACT;
            case "*" -> operation = Operation.MULTIPLY;
            case "/" -> operation = Operation.DIVIDE;
            default -> {
                System.out.println("Ошибка: выберите операцию из списка (+, -, \\*, /)");
                return;
            }
        }

        System.out.println("Введите второе число:");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите число.");
            return;
        }
        double secondNumber = scanner.nextDouble();

        if (operation == Operation.DIVIDE && secondNumber == 0) {
            System.out.println("Ошибка: Деление на ноль невозможно.");
            return;
        }

        double result = Calculator.calculate(firstNumber, secondNumber, operation);

        System.out.printf("Результат: %.2f%n", result);
    }
}
