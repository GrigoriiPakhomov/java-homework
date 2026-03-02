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

        System.out.println("Введите операцию (+, -, *, /):");
        String inputOperation = scanner.nextLine();

        Operation operation;
        try {
            operation = Operation.fromString(inputOperation);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return; 
        }

        System.out.println("Введите второе число:");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите число.");
            return;
        }
        double secondNumber = scanner.nextDouble();

        try {
            double result = operation.apply(firstNumber, secondNumber);
            System.out.printf("Результат: %.2f%n", result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
