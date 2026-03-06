package main.java.checkNumber;

public class CheckNumber {

    public static boolean checkPower(int input) {

        for (int i = 2; i < input; i++) {

            int result = i;

            while (result < input) {
                result *= i;
            }

            if (result == input) {
                return true;
            }
        }

        return false;
    }
}