package main.java.maxMin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введено не целое число");
            return;
        }
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введено не целое число");
            return;
        }
        int secondNumber = scanner.nextInt();

        System.out.println("Введите третье целое число:");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введено не целое число");
            return;
        }
        int thirdNumber = scanner.nextInt();

        int maxNumber = firstNumber;
        int minNumber = firstNumber;

        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        if (secondNumber < minNumber) {
            minNumber = secondNumber;
        }

        if (thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        }
        if (thirdNumber < minNumber) {
            minNumber = thirdNumber;
        }

        System.out.printf("Максимум: %d%nМинимум: %d%n", maxNumber, minNumber);
    }
}