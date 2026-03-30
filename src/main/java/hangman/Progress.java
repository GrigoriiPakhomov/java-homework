package main.java.hangman;

public class Progress {

    private final String word;

    private final char[] progress;

    private final boolean[] usedLetters = new boolean[26];

    private int openedLettersCount = 0;

    public Progress(String word) {

        this.word = word;

        progress = new char[word.length()];

        for (int i = 0; i < progress.length; i++) {
            progress[i] = '_';
        }
    }


    public boolean isLetterUsed(char letter) {

        return usedLetters[letter - 'a'];
    }


    public boolean openLetter(char letter) {

        usedLetters[letter - 'a'] = true;

        boolean found = false;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter && progress[i] == '_') {

                progress[i] = letter;

                openedLettersCount++;

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

        for (int i = 0; i < usedLetters.length; i++) {

            if (usedLetters[i]) {

                sb.append((char) (i + 'a')).append(" ");
            }
        }

        return sb.toString().trim();
    }


    public boolean isComplete() {

        return openedLettersCount == word.length();
    }
}