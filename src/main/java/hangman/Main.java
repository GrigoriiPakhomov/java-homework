package main.java.hangman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Words words = new Words();
        Game game = new Game();

        String word = words.getWord();
        Progress progress = new Progress(word);

        System.out.println("Добро пожаловать в игру \"Виселица\"!");
        System.out.printf("Загадано слово из %d букв. У вас 7 попыток.\n", word.length());

        while (true){

            System.out.println("Слово: " + progress.getProgressString() );
            System.out.println("Использованные буквы: " + progress.getUsedLettersString());
            System.out.println("Введите букву: ");

            String input = scanner.nextLine().toLowerCase();

            if (!InputValidator.isValidLetter(input)) {
                System.out.println("Введите одну латинскую букву!");
                continue;
            }

            char letter = input.charAt(0);

            if (progress.isLetterUsed(letter)) {
                System.out.println("Вы уже вводили эту букву!");
                continue;
            }

            progress.addUsedLetter(letter);

            boolean found = progress.openLetter(word, letter);

            if (found) {
                System.out.println("Вы угадали!");
            } else {
                game.reduceLives();
                System.out.println("Такой буквы нет. Осталось попыток: " + game.getLives());
            }


            if (progress.isComplete()) {
                System.out.println("Вы победили! Слово: " + word);
                break;
            }

            if (game.getLives() == 0) {
                System.out.println("Вы проиграли! Слово было: " + word);
                break;
            }
        }
    }
}
