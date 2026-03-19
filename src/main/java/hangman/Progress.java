package main.java.hangman;

import java.util.HashSet;
import java.util.Set;

public class Progress {

    private char[] progress;
    private Set<Character> usedLetters = new HashSet<>();

    public Progress(String word) {
        progress = new char[word.length()];
        for (int i = 0; i < progress.length; i++) {
            progress[i] = '_';
        }
    }


    public boolean isLetterUsed(char letter) {
        return usedLetters.contains(letter);
    }


    public void addUsedLetter(char letter) {
        usedLetters.add(letter);
    }


    public boolean openLetter(String word, char letter) {
        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                progress[i] = letter;
                found = true;
            }
        }

        return found;
    }


    public String getProgressString() {
        StringBuilder sb = new StringBuilder();
        for (char c : progress) {
            sb.append(c).append(" ");
        }
        return sb.toString().trim();
    }


    public String getUsedLettersString() {
        StringBuilder sb = new StringBuilder();
        for (char c : usedLetters) {
            sb.append(c).append(" ");
        }
        return sb.toString().trim();
    }


    public boolean isComplete() {
        for (char c : progress) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}