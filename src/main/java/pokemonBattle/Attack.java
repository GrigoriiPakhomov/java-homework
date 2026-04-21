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

        for (Pokemon target : targets) {

            int damage =
                    (int) (
                            user.getAttack()
                                    * user.getType()
                                    .getEffectiveness(
                                            target.getType()
                                    )
                    );

            target.takeDamage(damage);

            System.out.printf(
                    "%s (%s) атакует %s (%s) и наносит %d урона%n",
                    user.getName(),
                    user.getType(),
                    target.getName(),
                    target.getType(),
                    damage
            );
        }

        resetCooldown();
    }
}