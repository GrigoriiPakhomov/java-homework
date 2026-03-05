package main.java.isPalindrome;

public class Palindrome {
    public static boolean isPalindrome(String input){
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Строка не может быть пустой или содержать только пробелы.");
        }

        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);

            if (!Character.isLetter(leftChar)) {
                left++;
                continue;
            }

            if (!Character.isLetter(rightChar)) {
                right--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
