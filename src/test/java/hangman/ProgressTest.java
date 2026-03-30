package test.java.hangman;

import main.java.hangman.Progress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressTest {

    @Test
    void shouldOpenLetterIfExists() {

        Progress progress = new Progress("apple");

        boolean result = progress.openLetter('a');

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseIfLetterNotExists() {

        Progress progress = new Progress("apple");

        boolean result = progress.openLetter('z');

        assertFalse(result);
    }

    @Test
    void shouldDetectCompleteWord() {

        Progress progress = new Progress("apple");

        progress.openLetter('a');
        progress.openLetter('p');
        progress.openLetter('l');
        progress.openLetter('e');

        assertTrue(progress.isComplete());
    }
}