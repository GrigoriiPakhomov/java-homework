package main.java.pokemonBattle;

import java.util.Scanner;

public class BattleGame {
    private Scanner scanner = new Scanner(System.in);
    private Pokemon player = new Pokemon("Пикачу", 100, 15, 1);
    private Pokemon enemy = new Pokemon("Чармандер", 100, 12, 1);
    private Skill attack = new Attack();
    private Skill heal = new Heal(10);

    public void startGame() {

        System.out.println("Битва начинается!");

        while (player.isAlive() && enemy.isAlive()) {

            playerTurn();

            if (!enemy.isAlive()) break;

            enemyTurn();
        }

        finishGame();

        scanner.close();
    }

    private void playerTurn() {

        System.out.printf("""
                        Ваше здоровье: %d
                        Здоровье противника: %d

                        Выберите действие:
                        1 — Атака
                        2 — Лечение
                        """,
                player.getHp(),
                enemy.getHp()
        );

        int choice = scanner.nextInt();

        if (choice==1) {

            attack.use(player, enemy);

        } else {

            heal.use(player, player);
        }
    }

    private void enemyTurn() {

        System.out.println("\nПротивник атакует!");

        attack.use(enemy, player);
    }

    private void finishGame() {

        if (player.isAlive()) {

            System.out.println("\nВы победили!");

            player.levelUp();

        } else {

            System.out.println("\nВы проиграли!");
        }
    }
}