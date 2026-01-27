package main.java.lightningDistance;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final double SPEED_OF_SOUND = 331; // Источник: https://ru.wikipedia.org/wiki/Скорость_звука
    private static final double METRS_IN_KILOMETRS = 1000;

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");

        LOG.info("Введите количество секунд между вспышкой молнии и громом: ");

        Scanner scanner = new Scanner(System.in);
        double seconds = scanner.nextDouble();

        double distanceMetr = seconds * SPEED_OF_SOUND;
        double distanceKilometrs = distanceMetr/METRS_IN_KILOMETRS;


        String result = String.format("От вспышки до звука прошло %.2f секунд Молния ударила примерно в %.2f метрах( %.2f км) от вас.",
                seconds, distanceMetr, distanceKilometrs);
        LOG.info(result);
    }
}
