package main.java.dice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какой кубик бросить? (d4, d6, d8, d10, d12, d20):");
        String dice = scanner.nextLine();

        DiceRandom diceRandom = new DiceRandom();

        try {
            int result = diceRandom.diceroll(dice);
            System.out.printf("Вы бросили %s. Результат: %d", dice, result);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
