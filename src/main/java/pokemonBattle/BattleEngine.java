package main.java.pokemonBattle;

import java.util.List;

public class BattleEngine {

    public void startBattle(
            Player player1,
            Player player2
    ) {

        int round = 1;

        while (
                player1.getTeam().isAlive()
                        &&
                        player2.getTeam().isAlive()
        ) {

            System.out.println(
                    "\n========= Раунд "
                            + round++
                            + " ========="
            );

            executeTurn(player1, player2);

            if (!player2.getTeam().isAlive()) {

                break;
            }

            executeTurn(player2, player1);
        }

        finishBattle(player1, player2);
    }

    private void executeTurn(
            Player attacker,
            Player defender
    ) {

        System.out.println(
                "\nХод команды "
                        + attacker.getClass()
                        .getSimpleName()
        );

        for (Pokemon pokemon :
                attacker.getTeam()
                        .getAlivePokemons()) {

            System.out.println(
                    "\nХодит "
                            + pokemon.getName()
            );

            Skill skill =
                    attacker.chooseSkill(pokemon);

            if (!skill.isReady()) {

                System.out.println(
                        "Способность на перезарядке!"
                );

                skill.reduceCooldown();

                continue;
            }

            List<Pokemon> targets =
                    attacker.chooseTargets(
                            skill,
                            defender.getTeam()
                    );

            skill.use(pokemon, targets);

            printHp(targets);

            skill.reduceCooldown();
        }
    }

    private void printHp(
            List<Pokemon> targets
    ) {

        for (Pokemon target : targets) {

            System.out.println(
                    target.getName()
                            + " осталось HP: "
                            + target.getHp()
            );
        }
    }

    private void finishBattle(
            Player p1,
            Player p2
    ) {

        if (p1.getTeam().isAlive()) {

            System.out.println(
                    "\nИгрок победил!"
            );

        } else {

            System.out.println(
                    "\nКомпьютер победил!"
            );
        }
    }
}