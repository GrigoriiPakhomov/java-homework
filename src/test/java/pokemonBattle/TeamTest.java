package test.java.pokemonBattle;

import main.java.pokemonBattle.Pokemon;
import main.java.pokemonBattle.PokemonType;
import main.java.pokemonBattle.Team;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeamTest {

    @Test
    @DisplayName("Получение живых покемонов должно возвращать только живых")
    public void testGetOnlyAlive() {

        Pokemon p1 =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        Pokemon p2 =
                new Pokemon(
                        "Squirtle",
                        PokemonType.WATER,
                        100,
                        10,
                        1
                );

        p2.takeDamage(100);

        Team team =
                new Team(
                        List.of(
                                p1,
                                p2
                        )
                );

        assertEquals(
                1,
                team.getAlivePokemons().size()
        );
    }

    @Test
    @DisplayName("Команда жива, когда хотя бы один покемон жив")
    public void testAliveWhenOnePokemonAlive() {

        Pokemon p1 =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        Pokemon p2 =
                new Pokemon(
                        "Squirtle",
                        PokemonType.WATER,
                        100,
                        10,
                        1
                );

        p2.takeDamage(100);

        Team team =
                new Team(
                        List.of(
                                p1,
                                p2
                        )
                );

        assertTrue(
                team.isAlive()
        );
    }
}