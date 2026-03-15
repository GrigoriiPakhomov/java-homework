package main.java.Example;

public class MultipleArgsExample {

    // Первый аргумент - строка, второй - varargs
    public static void printData(String title, int... values) {
        System.out.println("--- " + title + " ---");
        if (values.length == 0) {
            System.out.println("Нет данных.");
            return;
        }
        for (int value : values) {
            System.out.println("Значение: " + value);
        }
    }

    public static void main(String[] args) {
        printData("Результаты");
        printData("Оценки", 5, 4, 5, 3);
    }
}