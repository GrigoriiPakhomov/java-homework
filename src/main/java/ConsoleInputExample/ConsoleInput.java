package main.java.ConsoleInputExample;

//import java.io.Console; // Импорт класса Console
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine(); // Считываем строку
        System.out.println("Привет, " + name + "!");

        scanner.close();
    }
}