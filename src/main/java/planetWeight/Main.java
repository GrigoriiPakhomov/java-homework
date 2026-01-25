package main.java.planetWeight;


//import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("Меркурий", 0.38),
                new Planet("Венера", 0.91),
                new Planet("Марс", 0.38),
                new Planet("Юпитер", 2.53),
                new Planet("Сатурн", 1.07),
                new Planet("Уран", 0.89),
                new Planet("Нептун", 1.13)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш вес на Земле (кг): ");
        double weight = scanner.nextDouble();

        System.out.println("\nСпасибо! Вот как бы вы весили на других планетах:");

        for (Planet planet : planets) {
            double result = weight * planet.Factor;
            System.out.printf("- %s: %.2f кг%n", planet.name, result);
        }

        scanner.close();
    }
}