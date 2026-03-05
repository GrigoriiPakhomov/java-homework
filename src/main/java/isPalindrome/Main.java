package main.java.isPalindrome;

import java.util.Scanner;

import static main.java.isPalindrome.Palindrome.isPalindrome;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку для проверки на палиндром:");
            String input = scanner.nextLine();

            if (input.isBlank()) {
                throw new IllegalArgumentException("Строка не может быть пустой или содержать только пробелы.");
            }

            boolean result = isPalindrome(input);

            if (result == true) {
                System.out.printf("Строка %s является палиндромом.", input);
            } else {
                System.out.printf("Строка %s не является палиндромом", input);
            }
            break;
        }
    }
}
