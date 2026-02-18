package main.java.maxMin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int firstNumber = InputHelper.readNumber(scanner);

        System.out.println("Введите второе целое число:");
        int secondNumber = InputHelper.readNumber(scanner);

        System.out.println("Введите третье целое число:");
        int thirdNumber = InputHelper.readNumber(scanner);

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