package main.java.temperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите исходную единицу измерения (C, F, K):");
        String inputTemp = scanner.next().trim().toUpperCase();
        TempUnit tempUnit;

        switch (inputTemp){
            case "C" -> tempUnit = TempUnit.CELSIUS;
            case "F" -> tempUnit = TempUnit.FAHRENHEIT;
            case "K" -> tempUnit = TempUnit.KELVIN;
            default -> {
                System.out.println("Ошибка: нужно выбрать исходную единицу измерения температуры (например, Цельсий 'C', Фаренгейт 'F' или Кельвин 'K");
                return;
            }
        }

        System.out.println("Введите температуру:");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: температура должна быть числом");
            return;
        }
        double temp = scanner.nextDouble();


        System.out.println("Введите единицу измерения для конвертации (C, F, K):");
        String outputTemp = scanner.next().trim().toUpperCase();

        TempUnit outTempUnit;

        switch (outputTemp){
            case "C" -> outTempUnit = TempUnit.CELSIUS;
            case "F" -> outTempUnit = TempUnit.FAHRENHEIT;
            case "K" -> outTempUnit = TempUnit.KELVIN;
            default -> {
                System.out.println("Ошибка: нужно выбрать исходную единицу измерения температуры (например, Цельсий 'C', Фаренгейт 'F' или Кельвин 'K");
                return;
            }
        }

        double result = Converter.convert(temp, tempUnit, outTempUnit);


        System.out.printf(
                "%.2f %s = %.2f %s%n",
                temp,
                tempUnit.getUnitName(),
                result,
                outTempUnit.getUnitName()
        );
    }
}
