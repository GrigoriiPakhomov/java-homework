package main.java.fizzBuzz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;

        while (true) {
            System.out.println("Введите целое число N:");

            try {
                input = scanner.nextInt();

                if (input <= 0) {
                    System.out.println("N должно быть положительным числом.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите целое число.");
                scanner.next();
            }
        }

        for (int i = 1; i <= input; i++) {
            System.out.println(FizzBuzz.getFizzBuzzValue(i));
        }
    }
}
