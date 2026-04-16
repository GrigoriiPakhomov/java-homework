package main.java.pokemonBattle;

public class Heal extends Skill {

    private int healAmount;

    public Heal(int healAmount) {
        this.healAmount = healAmount;
    }

    @Override
    public void use(Pokemon user, Pokemon target) {

        target.heal(healAmount);

        System.out.println(
                user.getName()
                        + " восстанавливает "
                        + healAmount
                        + " здоровье!"
        );
    }
}