package main.java.timeToSeconds;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TimeToSeconds converter = new TimeToSeconds();

        System.out.println("Введите длительность видео в формате mm:ss:");

        String inputTime = scanner.nextLine();

        try {
            int totalSeconds = converter.toSeconds(inputTime);
            System.out.println("Общая длительность видео: " + totalSeconds + " секунд.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: минуты и секунды должны быть числами.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: неверный формат. Используйте mm:ss.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}