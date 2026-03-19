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
            System.out.println("Использованные буквы: ");
            System.out.println("Введите букву: ");

            String input = scanner.nextLine();

            char letter = input.toLowerCase().charAt(0);

            boolean before = progress.getProgressString().contains(String.valueOf(letter));

            progress.openLetter(word,letter);

            boolean after = progress.getProgressString().contains(String.valueOf(letter));

            if(before == after){
                game.reduceLives();
                System.out.printf("Такой буквы нет.Осталось попыток %d", game.getLives());
            }else {
                System.out.println("Вы угадали!");
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
