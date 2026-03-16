package main.java.multiplicationTableTrainer;

public class Statistic {
    public static void printStatistic(int total, int correct, int wrong) {
        System.out.println("""
                --- Статистика за сессию ---
                """);

        System.out.println("Всего примеров: " + total);
        System.out.println("Правильных ответов: " + correct);
        System.out.println("Неправильных ответов: " + wrong);
        System.out.println();
    }
}
