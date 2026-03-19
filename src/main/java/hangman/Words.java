package main.java.hangman;

import java.util.Random;

public class Words {
    private String[] words = {"apple", "grape", "peach", "melon", "berry",
            "lemon", "mango", "cherry", "olive", "plums"};

    private Random random = new Random();

    public String getWord() {
        int index = random.nextInt(words.length);
        return words[index];
    }
}
