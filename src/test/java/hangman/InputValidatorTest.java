package main.java.hangman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void shouldAcceptLatinLetter() {
        assertTrue(InputValidator.isValidLetter("a"));
    }

    @Test
    void shouldRejectCyrillicLetter() {
        assertFalse(InputValidator.isValidLetter("я"));
    }

    @Test
    void shouldRejectDigit() {
        assertFalse(InputValidator.isValidLetter("5"));
    }

    @Test
    void shouldRejectMultipleLetters() {
        assertFalse(InputValidator.isValidLetter("ab"));
    }

    @Test
    void shouldRejectSpecialSymbol() {
        assertFalse(InputValidator.isValidLetter("@"));
    }
}