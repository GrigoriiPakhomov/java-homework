package main.java.pokemonBattle;

import java.util.List;
import java.util.Scanner;

public class HumanPlayer extends Player {

    private final Scanner scanner;

    private final Skill attackSkill = new Attack();
    private final Skill healSkill = new Heal(15);
    private final Skill fireBlastSkill = new FireBlast();

    public HumanPlayer(
            Team team,
            Scanner scanner
    ) {

        super(team);
        this.scanner = scanner;
    }

    @Override
    public Skill chooseSkill(
            Pokemon pokemon
    ) {

        System.out.println("""
                Выберите способность:
                1 - Attack
                2 - Heal
                3 - FireBlast (AOE)
                """);

        int choice = scanner.nextInt();

        return switch (choice) {

            case 2 -> healSkill;
            case 3 -> fireBlastSkill;

            default -> attackSkill;
        };
    }

    @Override
    public List<Pokemon> chooseTargets(
            Skill skill,
            Team enemyTeam
    ) {

        if (skill instanceof Heal) {

            return List.of(
                    team.getAlivePokemons().get(0)
            );
        }

        if (skill instanceof FireBlast) {

            return enemyTeam.getAlivePokemons();
        }

        System.out.println("Выберите цель:");

        List<Pokemon> enemies =
                enemyTeam.getAlivePokemons();

        for (int i = 0;
             i < enemies.size();
             i++) {

            System.out.println(
                    (i + 1)
                            + " "
                            + enemies.get(i).getName()
                            + " HP:"
                            + enemies.get(i).getHp()
            );
        }

        int index =
                scanner.nextInt() - 1;

        return List.of(
                enemies.get(index)
        );
    }
}