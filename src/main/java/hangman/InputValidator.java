package main.java.hangman;

public class InputValidator {
    public static boolean isValidLetter(String input){
        if(input == null || input.length() !=1){
            return false;
        }

        char letter = input.charAt(0);

        return   letter >= 'a' && letter <= 'z';
    }
}
