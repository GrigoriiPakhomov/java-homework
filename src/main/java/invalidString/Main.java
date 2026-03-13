package main.java.invalidString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сломанную строку:");
        String input = scanner.nextLine();

        String out = FixString.fixString(input);

        System.out.printf("Исправленная строка:%s", out);
    }
}
