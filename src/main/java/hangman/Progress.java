package main.java.hangman;

public class Progress {

    private char[] progress;

    public Progress(String word) {
        progress = new char[word.length()];
        for (int i = 0; i < progress.length; i++) {
            progress[i] = '_';
        }
    }

    public void openLetter(String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                progress[i] = letter;
            }
        }
    }

    public String getProgressString() {
        StringBuilder sb = new StringBuilder();
        for (char c : progress) {
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