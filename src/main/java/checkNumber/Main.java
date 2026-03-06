package main.java.checkNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println("Введите целое положительное число N:");

            try {
                input = scanner.nextInt();

                if (input <= 1) {
                    System.out.println("N должно быть больше 1");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Введите корректное число");
                scanner.next();
            }
        }

        if (CheckNumber.checkPower(input)) {
            System.out.printf("Число %d является степенью другого числа%n", input);
        } else {
            System.out.printf("Число %d не является степенью другого числа%n", input);
        }

        scanner.close();
    }
}