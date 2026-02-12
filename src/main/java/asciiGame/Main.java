package main.java.asciiGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RandomChoice randomChoice = new RandomChoice();

        char letter = randomChoice.randomChar();

        System.out.printf("Угадайте ASCII-код для буквы %c:", letter);

        try {
            int input = scanner.nextInt();

            int correctCode = letter;

            if(input == correctCode){
                System.out.println("Поздравляем! Вы угадали!");
            } else {
                System.out.println("Неправильно. Правильный ответ: " + correctCode);
            }
        }catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите число.");
        }

    }
}
