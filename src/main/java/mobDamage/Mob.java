package main.java.mobDamage;

public class Mob {
    String name;
    double health;
    double maxHealth;
    double armorPercent;

    public Mob(String name, double maxHealth, double armorPercent) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.armorPercent = armorPercent;
        this.health = maxHealth;
    }

    public double takeDamage(double baseDamage) {
        double blockedDamage = baseDamage * armorPercent;
        double finalDamage = baseDamage - blockedDamage;

        health -= finalDamage;

        return finalDamage;
    }
}
