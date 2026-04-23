package main.java.pokemonBattle;

import java.util.List;

public abstract class Skill {

    private final int cooldown;

    private int currentCooldown = 0;

    public Skill(int cooldown) {

        this.cooldown = cooldown;
    }

    public boolean isReady() {

        return currentCooldown==0;
    }

    public void resetCooldown() {

        currentCooldown = cooldown;
    }

    public void reduceCooldown() {

        if (currentCooldown > 0) {

            currentCooldown--;
        }
    }

    public abstract void use(
            Pokemon user,
            List<Pokemon> targets
    );
}