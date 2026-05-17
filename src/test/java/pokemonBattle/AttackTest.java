package test.java.pokemonBattle;

import main.java.pokemonBattle.Attack;
import main.java.pokemonBattle.Pokemon;
import main.java.pokemonBattle.PokemonType;
import main.java.pokemonBattle.Skill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttackTest {

    @Test
    @DisplayName("Проверка нанесения урона")
    public void testDealDamage() {

        Pokemon attacker =
                new Pokemon(
                        "Pikachu",
                        PokemonType.ELECTRIC,
                        100,
                        15,
                        1
                );

        Pokemon target =
                new Pokemon(
                        "Squirtle",
                        PokemonType.WATER,
                        100,
                        10,
                        1
                );

        Skill attack = new Attack();

        attack.use(
                attacker,
                List.of(target)
        );

        assertEquals(
                85,
                target.getHp()
        );
    }
}