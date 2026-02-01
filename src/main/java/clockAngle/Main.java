package main.java.clockAngle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите часы: ");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты: ");
        int minutes = scanner.nextInt();

        Clock clock = new Clock(hours, minutes);

        System.out.printf("Первый угол: %.1f°\n", clock.getHourAngle());
        System.out.printf("Второй угол: %.1f°\n", clock.getMinuteAngle());
        System.out.printf("Наименьший угол между стрелками: %.1f°\n", clock.getSmallestAngle());

    }
}