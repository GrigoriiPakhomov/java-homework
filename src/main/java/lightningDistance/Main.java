package main.java.lightningDistance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд между вспышкой молнии и громом: ");
        Scanner scanner = new Scanner(System.in);
        double seconds = scanner.nextDouble();
        double speedOfSound = 331; // Источник: https://ru.wikipedia.org/wiki/Скорость_звука
        double distanceMetr = seconds * speedOfSound;
        double distanceKilometrs = distanceMetr/1000;


        System.out.printf("От вспышки до звука прошло %.2f секунд Молния ударила примерно в %.2f метрах( %.2f км) от вас.", seconds,
                distanceMetr, distanceKilometrs);
    }
}
