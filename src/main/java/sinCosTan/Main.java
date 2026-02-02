package main.java.sinCosTan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите угол в градусах: ");
        double angle = scanner.nextDouble();
        try {
            SinCosTan result = new SinCosTan(angle);

            System.out.printf("Угол: %.1f градусов \n", angle);
            System.out.printf("Синус: %.2f \n", result.getSin());
            System.out.printf("Косинус: %.2f \n", result.getCos());
            System.out.printf("Тангенс: %.2f \n", result.getTan());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
