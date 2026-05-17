package test.java.pokemonBattle;

import main.java.pokemonBattle.Pokemon;
import main.java.pokemonBattle.PokemonType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokemonTest {

    @Test
    @DisplayName("Получение урона должно уменьшать здоровье покемона")
    public void testReduceHp() {

        Pokemon pokemon =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        pokemon.takeDamage(20);

        assertEquals(
                80,
                pokemon.getHp()
        );
    }

    @Test
    @DisplayName("Получение урона не должно уменьшать здоровье ниже нуля")
    public void testHpNotBelowZero() {

        Pokemon pokemon =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        pokemon.takeDamage(150);

        assertEquals(
                0,
                pokemon.getHp()
        );
    }

    @Test
    @DisplayName("Лечение должно восстанавливать здоровье покемона")
    public void testRestoreHp() {

        Pokemon pokemon =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        pokemon.takeDamage(30);

        pokemon.heal(20);

        assertEquals(
                90,
                pokemon.getHp()
        );
    }

    @Test
    @DisplayName("Лечение не должно превышать максимальное здоровье")
    public void testHealNotExceedMaxHp() {

        Pokemon pokemon =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        pokemon.heal(50);

        assertEquals(
                100,
                pokemon.getHp()
        );
    }

    @Test
    @DisplayName("Покемон жив, когда здоровье больше нуля")
    public void testAliveWhenHpPositive() {

        Pokemon pokemon =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        assertTrue(
                pokemon.isAlive()
        );
    }

    @Test
    @DisplayName("Покемон мёртв, когда здоровье равно нулю")
    public void testDeadWhenHpZero() {

        Pokemon pokemon =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        pokemon.takeDamage(100);

        assertFalse(
                pokemon.isAlive()
        );
    }

}