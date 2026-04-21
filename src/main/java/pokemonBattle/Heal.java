package main.java.pokemonBattle;

import java.util.List;

public class Heal extends Skill {

    private final int healAmount;

    public Heal(
            int healAmount
    ) {

        super(1);

        this.healAmount = healAmount;
    }

    @Override
    public void use(
            Pokemon user,
            List<Pokemon> targets
    ) {

        user.heal(healAmount);

        System.out.println(
                user.getName()
                        + " восстанавливает "
                        + healAmount
                        + " HP"
        );

        resetCooldown();
    }
}