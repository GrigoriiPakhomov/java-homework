package main.java.stockManager;


import java.util.Scanner;

public class InputUtils {

    public static int readInt(Scanner scanner, String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine();

            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println("Ошибка: введите целое число.");

            }
        }
    }

    public static double readDouble(Scanner scanner, String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine();

            try {

                return Double.parseDouble(input);

            } catch (NumberFormatException e) {

                System.out.println("Ошибка: введите число.");

            }
        }
    }

    public static String readString(Scanner scanner, String message) {

        System.out.print(message);

        return scanner.nextLine().trim();
    }
}
