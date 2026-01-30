package main.java.mobDamage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите базовый урон вашей атаки: ");
        double baseDamage = scanner.nextDouble();

        Mob goblin = new Mob("Гоблин", 100.0, 0.2);

        double blockedDamage = goblin.getBlockedDamage(baseDamage);
        double finalDamage = goblin.takeDamage(baseDamage);

        System.out.printf("Атака наносит %.1f базового урона...%n", baseDamage);
        System.out.printf(
                "Броня %s (%.0f%%) заблокировала %.1f урона.%n",
                goblin.getName(),
                goblin.getArmorPercent(),
                blockedDamage
        );
        System.out.printf("Итоговый урон по цели: %.1f.%n", finalDamage);
        System.out.printf(
                "Здоровье %s: %.1f / %.1f.%n",
                goblin.getName(),
                goblin.getHealth(),
                goblin.getMaxHealth()
        );
    }
}
