package main.java.asciiGame;

import java.util.Random;


public class RandomChoice {
    private final  Random random = new Random();

    public char randomChar(){
        int randomInt = random.nextInt(26);
        char result = (char) ('A' + randomInt);
        return result;
    }
}
