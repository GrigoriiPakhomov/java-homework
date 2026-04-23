package main.java.pokemonBattle;

import java.util.List;
import java.util.Random;

public class ComputerPlayer extends Player {

    private final Random random = new Random();

    private final Skill attackSkill = new Attack();
    private final Skill fireBlast = new FireBlast();

    public ComputerPlayer(
            Team team
    ) {

        super(team);
    }

    @Override
    public Skill chooseSkill(
            Pokemon pokemon
    ) {

        Skill skill;

        if (random.nextBoolean()) {

            skill = attackSkill;

        } else {

            skill = fireBlast;
        }

        System.out.println(
                pokemon.getName()
                        + " использует "
                        + skill.getClass().getSimpleName()
        );

        return skill;
    }

    @Override
    public List<Pokemon> chooseTargets(
            Skill skill,
            Team enemyTeam
    ) {

        if (skill instanceof FireBlast) {

            return enemyTeam.getAlivePokemons();
        }

        return List.of(
                enemyTeam.getAlivePokemons()
                        .get(0)
        );
    }
}