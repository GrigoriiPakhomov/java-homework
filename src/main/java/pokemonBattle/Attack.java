package main.java.pokemonBattle;

public class Attack extends Skill {

    @Override
    public void use(Pokemon user, Pokemon target) {

        int damage = user.getAttack();

        target.takeDamage(damage);

        System.out.println(
                user.getName()
                        + " attacks "
                        + target.getName()
                        + " for "
                        + damage
                        + " damage!"
        );
    }
}