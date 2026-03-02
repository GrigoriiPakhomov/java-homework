package test.java.isPalindrome;

import main.java.isPalindrome.Palindrome;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void testValidPalindrome(){

        String input = "довод";

        boolean result = Palindrome.isPalindrome(input);

        assertTrue(result);
    }

    @Test
    public void testNotPalindrome(){
        String input = "hello";

        boolean result = Palindrome.isPalindrome(input);

        assertFalse(result);
    }

    @Test
    public void testEmptyString(){
        String input = "";

        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(input));
    }
}
