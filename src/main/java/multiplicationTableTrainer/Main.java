package main.java.multiplicationTableTrainer;

import java.util.Scanner;

import static main.java.multiplicationTableTrainer.MultiplicationTable.showTable;
import static main.java.multiplicationTableTrainer.Trainer.startTrainer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    ---Тренажер таблицы умножения---
                    1. Вывести таблицу умножения (полную)
                    2. Запустить режим тренировки
                    3. Выход             
                    """);

            if (!scanner.hasNextInt() ){
                System.out.println("Ошибка: Некорректный ввод. Пожалуйста, введите число (1-3).");
            }

            int choise = scanner.nextInt();

            switch (choise){
                case 1 -> showTable();
                case 2 -> startTrainer();
                case 3 -> {
                    System.out.println("Программа завершена.");
                    return;
                }
                default -> System.out.println("Ошибка: Некорректный ввод. Пожалуйста, введите число (1-3)");
            }
        }
    }
}
