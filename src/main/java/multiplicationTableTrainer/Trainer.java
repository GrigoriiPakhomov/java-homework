package main.java.multiplicationTableTrainer;

import java.util.Random;
import java.util.Scanner;

public class Trainer {

    public static void startTrainer() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correct = 0;
        int wrong = 0;
        int total = 0;

        System.out.println("\n--- Режим тренировки ---");
        System.out.println("(Введите 'exit' для выхода)\n");

        while (true) {

            int a = random.nextInt(8) + 2;
            int b = random.nextInt(8) + 2;

            int result = a * b;

            System.out.printf("Сколько будет %d x %d? ", a, b);

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {

                int answer = Integer.parseInt(input);

                total++;

                if (answer == result) {
                    correct++;
                    System.out.println("Правильно!\n");
                } else {
                    wrong++;
                    System.out.printf("Неправильно. Правильный ответ: %d\n\n", result);
                }

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число или 'exit'.\n");
            }

        }

        System.out.println("""
                --- Статистика за сессию ---
                """);

        System.out.println("Всего примеров: " + total);
        System.out.println("Правильных ответов: " + correct);
        System.out.println("Неправильных ответов: " + wrong);
        System.out.println();
    }
}