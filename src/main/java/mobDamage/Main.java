package main.java.mobDamage;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");

        LOG.info("Введите базовый урон вашей атаки: ");

        Scanner scaner = new Scanner(System.in);
        double baseDamage = scaner.nextDouble();

        Mob goblin = new Mob("Гоблин", 100.0, 0.2);
        double damage = goblin.takeDamage(baseDamage);

        String attack = String.format("Атака наносит %.1f базового урона...%n", baseDamage);
        LOG.info(attack);

        String armor = String.format("Броня гоблина (%.0f%%) заблокировала %.1f урона.%n",
                goblin.armorPercent * 100, baseDamage * goblin.armorPercent);
        LOG.info(armor);

        String finalDamage = String.format("Итоговый урон по цели: %.1f.%n", damage);
        LOG.info(finalDamage);

        String goblinHealth = String.format("Здоровье гоблина: %.1f / %.1f.%n", goblin.health, goblin.maxHealth);
        LOG.info(goblinHealth);

    }
}
