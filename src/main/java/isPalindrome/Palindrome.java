package main.java.isPalindrome;

public class Palindrome {
    public static boolean isPalindrome(String input){
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Строка не может быть пустой или содержать только пробелы.");
        }
        input = input.toLowerCase();

        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                cleaned.append(c);
            }
        }

        String cleanedString = cleaned.toString();


        char[] text = cleanedString.toCharArray();

        StringBuilder reversed = new StringBuilder();

        for (int i = text.length - 1; i >= 0; i--){
            reversed.append(text[i]);
        }

        String reversedString = reversed.toString();

        return input.equals(reversedString);
    }
}
