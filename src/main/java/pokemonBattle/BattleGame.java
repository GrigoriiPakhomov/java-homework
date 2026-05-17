package main.java.pokemonBattle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattleGame {

    private final Scanner scanner =
            new Scanner(System.in);

    public void startGame() {

        BattleMode mode =
                chooseMode();

        Team playerTeam =
                new Team(
                        selectPokemons(mode)
                );

        Team enemyTeam =
                new Team(
                        randomPokemons(mode)
                );

        printTeams(
                playerTeam,
                enemyTeam
        );

        Player player =
                new HumanPlayer(
                        playerTeam,
                        scanner
                );

        Player computer =
                new ComputerPlayer(
                        enemyTeam
                );

        BattleEngine engine =
                new BattleEngine();

        engine.startBattle(
                player,
                computer
        );
    }

    private void printTeams(
            Team player,
            Team enemy
    ) {

        System.out.println("\nВаша команда:");

        player.getAll().forEach(p ->
                System.out.println(
                        p.getName()
                                + " HP:"
                                + p.getHp()
                )
        );

        System.out.println("\nКоманда противника:");

        enemy.getAll().forEach(p ->
                System.out.println(
                        p.getName()
                                + " HP:"
                                + p.getHp()
                )
        );
    }

    private BattleMode chooseMode() {

        System.out.println("""
                Выберите режим:
                1 — 1x1
                2 — 2x2
                3 — 4x4
                """);

        int choice =
                scanner.nextInt();

        return switch (choice) {

            case 2 -> BattleMode.TWO_VS_TWO;

            case 3 -> BattleMode.FOUR_VS_FOUR;

            default -> BattleMode.ONE_VS_ONE;
        };
    }

    private List<Pokemon> selectPokemons(
            BattleMode mode
    ) {

        List<Pokemon> team =
                new ArrayList<>();

        for (int i = 0;
             i < mode.getTeamSize();
             i++) {

            System.out.println("""
                    Выберите покемона:
                    1 Pikachu
                    2 Charmander
                    3 Squirtle
                    4 Bulbasaur
                    """);

            int choice =
                    scanner.nextInt();

            team.add(
                    create(choice)
            );
        }

        return team;
    }

    private List<Pokemon> randomPokemons(
            BattleMode mode
    ) {

        List<Pokemon> team =
                new ArrayList<>();

        for (int i = 0;
             i < mode.getTeamSize();
             i++) {

            int random =
                    (int)
                            (Math.random() * 4 + 1);

            team.add(
                    create(random)
            );
        }

        return team;
    }

    private Pokemon create(
            int choice
    ) {

        return switch (choice) {

            case 2 -> PokemonFactory.createCharmander();

            case 3 -> PokemonFactory.createSquirtle();

            case 4 -> PokemonFactory.createBulbasaur();

            default -> PokemonFactory.createPikachu();
        };
    }
}