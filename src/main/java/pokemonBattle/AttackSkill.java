package main.java.pokemonBattle;

import java.util.List;

public class AttackSkill extends Skill {

    public AttackSkill() {

        super(0);
    }

    @Override
    public void use(Pokemon user, List<Pokemon> targets) {

        for (Pokemon target : targets) {

            int damage = (int) (
                    user.getAttack()
                            * user.getType()
                            .getEffectiveness(target.getType())
            );

            target.takeDamage(damage);

            System.out.println("""
                    %s атакует
                    %s на
                    %d"""
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