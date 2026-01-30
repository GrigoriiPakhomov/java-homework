package main.java.mobDamage;

public class Mob {
    private final String name;
    private final double maxHealth;
    private final double armorPercent;

    private double health;

    public Mob(String name, double maxHealth, double armorPercent) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.armorPercent = armorPercent;
        this.health = maxHealth;
    }

    public double takeDamage(double baseDamage) {
        double blockedDamage = baseDamage * armorPercent;
        double finalDamage = baseDamage - blockedDamage;

        health = Math.max(0, health-finalDamage);

        return finalDamage;
    }

    public double getBlockedDamage(double baseDamage) {
        return baseDamage * armorPercent;
    }

    public double getArmorPercent() {
        return armorPercent * 100;
    }

    public double getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public String getName() {
        return name;
    }
}
