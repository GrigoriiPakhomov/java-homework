package main.java.dice;

import java.util.Random;
public class DiceRandom {

    Random random = new Random();

    public int diceroll(String dice){
        return switch (dice) {
            case "d4" -> random.nextInt(4) + 1;
            case "d6" -> random.nextInt(6) + 1;
            case "d8" -> random.nextInt(8) + 1;
            case "d10" -> random.nextInt(10) + 1;
            case "d12" -> random.nextInt(12) + 1;
            case "d20" -> random.nextInt(12) + 1;
            default -> throw new IllegalArgumentException
                    ("Некорректный тип кубика. Пожалуйста, выберите из d4, d6, d8, d10, d12, d20.");
        };
    }
}
