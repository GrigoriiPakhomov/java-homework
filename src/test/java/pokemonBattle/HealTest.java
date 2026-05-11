package test.java.pokemonBattle;

import main.java.pokemonBattle.Heal;
import main.java.pokemonBattle.Pokemon;
import main.java.pokemonBattle.PokemonType;
import main.java.pokemonBattle.Skill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealTest {

    @Test
    @DisplayName("Лечение должно восстанавливать здоровье покемона")
    public void testRestoreHp() {

        Pokemon pokemon =
                new Pokemon(
                        "Charmander",
                        PokemonType.FIRE,
                        100,
                        12,
                        1
                );

        pokemon.takeDamage(40);

        Skill heal = new Heal(20);

        heal.use(
                pokemon,
                List.of(pokemon)
        );

        assertEquals(
                80,
                pokemon.getHp()
        );
    }

    @Test
    @DisplayName("Лечение не должно превышать максимальное здоровье")
    public void testNotExceedMaxHp() {

        Pokemon pokemon =
                new Pokemon(
                        "Charmander",
                        PokemonType.FIRE,
                        100,
                        12,
                        1
                );

        Skill heal = new Heal(50);

        heal.use(
                pokemon,
                List.of(pokemon)
        );

        assertEquals(
                100,
                pokemon.getHp()
        );
    }
}