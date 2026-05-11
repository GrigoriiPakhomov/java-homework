package test.java.pokemonBattle;

import main.java.pokemonBattle.FireBlast;
import main.java.pokemonBattle.Pokemon;
import main.java.pokemonBattle.PokemonType;
import main.java.pokemonBattle.Skill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireBlastTest {

    @Test
    @DisplayName("Огненный взрыв должен наносить урон всем целям")
    public void testDamageAllTargets() {

        Pokemon attacker =
                new Pokemon(
                        "Charmander",
                        PokemonType.FIRE,
                        100,
                        10,
                        1
                );

        Pokemon target1 =
                new Pokemon(
                        "Bulbasaur",
                        PokemonType.GRASS,
                        100,
                        8,
                        1
                );

        Pokemon target2 =
                new Pokemon(
                        "Squirtle",
                        PokemonType.WATER,
                        100,
                        8,
                        1
                );

        Skill fireBlast = new FireBlast();

        fireBlast.use(
                attacker,
                List.of(
                        target1,
                        target2
                )
        );

        assertEquals(
                80,
                target1.getHp()
        );

        assertEquals(
                80,
                target2.getHp()
        );
    }
}