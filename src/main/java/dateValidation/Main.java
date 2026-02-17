package main.java.dateValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        if(!scanner.hasNextInt()){
            System.out.println("Ошибка: введите число");
            return;
        }
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        if(!scanner.hasNextInt()){
            System.out.println("Ошибка: введите число");
            return;
        }
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        if(!scanner.hasNextInt()){
            System.out.println("Ошибка: введите число");
            return;
        }
        int year = scanner.nextInt();

        String result = Validation.validate(day, month, year);
        System.out.println(result);
    }
}
