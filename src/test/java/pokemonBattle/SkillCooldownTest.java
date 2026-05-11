package test.java.pokemonBattle;

import main.java.pokemonBattle.FireBlast;
import main.java.pokemonBattle.Skill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkillCooldownTest {

    @Test
    @DisplayName("Огненный взрыв должен уходить в перезарядку после использования")
    public void testFireBlastCooldown() {

        Skill fireBlast =
                new FireBlast();

        assertTrue(
                fireBlast.isReady()
        );

        fireBlast.resetCooldown();

        assertFalse(
                fireBlast.isReady()
        );

        fireBlast.reduceCooldown();
        fireBlast.reduceCooldown();

        assertTrue(
                fireBlast.isReady()
        );
    }
}