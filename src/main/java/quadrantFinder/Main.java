package main.java.quadrantFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату X:");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: координата X должна быть целым числом.");
            return;
        }
        int x = scanner.nextInt();

        System.out.println("Введите координату Y:");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: координата X должна быть целым числом.");
            return;
        }
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.printf("Точка (%d, %d) находится в I четверти.%n", x, y);
        } else if (x > 0 && y < 0) {
            System.out.printf("Точка (%d, %d) находится в IV четверти.%n", x, y);
        } else if
        (x < 0 && y > 0) {
            System.out.printf("Точка (%d, %d) находится в II четверти.%n", x, y);
        } else {
            System.out.printf("Точка (%d, %d) находится в III четверти.%n", x, y);
        }

    }
}

