package main.java.pokemonBattle;

import java.util.List;

public class Attack extends Skill {

    public Attack() {

        super(0);
    }

    @Override
    public void use(
            Pokemon user,
            List<Pokemon> targets
    ) {

        Pokemon target = targets.get(0);

        int damage = user.getAttack();

        target.takeDamage(damage);

        System.out.println("""
                %s атакует
                %s и наносит
                %d урона!"""
                .formatted(
                        user.getName(),
                        target.getName(),
                        damage
                )
        );
    }
}