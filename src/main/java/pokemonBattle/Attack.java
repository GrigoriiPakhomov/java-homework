package main.java.pokemonBattle;

public class Attack extends Skill {

    @Override
    public void use(Pokemon user, Pokemon target) {

        int damage = user.getAttack();

        target.takeDamage(damage);

        System.out.printf("%s атакует %s и наносит %d урона!%n",
                user.getName(),
                target.getName(),
                damage
        );
    }
}