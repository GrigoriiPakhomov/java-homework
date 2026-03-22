package test.java.hangman;


import main.java.hangman.Progress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressTest {

    @Test
    void shouldOpenLetterIfExists() {

        Progress progress = new Progress("apple");

        boolean result = progress.openLetter("apple", 'a');

        assertTrue(result);

    }

    @Test
    void shouldReturnFalseIfLetterNotExists() {

        Progress progress = new Progress("apple");

        boolean result = progress.openLetter("apple", 'z');

        assertFalse(result);

    }

    @Test
    void shouldDetectCompleteWord() {

        Progress progress = new Progress("apple");

        progress.openLetter("apple", 'a');
        progress.openLetter("apple", 'p');
        progress.openLetter("apple", 'l');
        progress.openLetter("apple", 'e');

        assertTrue(progress.isComplete());

    }
}