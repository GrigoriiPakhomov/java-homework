package main.java.pokemonBattle;

import java.util.List;

public class FireBlast extends Skill {

    public FireBlast() {

        super(2);
    }

    @Override
    public void use(
            Pokemon user,
            List<Pokemon> targets
    ) {

        for (Pokemon target : targets) {

            int damage =
                    user.getAttack() * 2;

            target.takeDamage(damage);

            System.out.println("""
                    %s использует FireBlast против
                    %s на
                    %d урона"""
                    .formatted(
                            user.getName(),
                            target.getName(),
                            damage
                    )
            );
        }

        resetCooldown();
    }
}