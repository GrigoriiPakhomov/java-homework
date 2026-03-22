package test.java.hangman;

import main.java.hangman.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    void shouldReduceLivesByOne() {

        Game game = new Game();

        game.reduceLives();

        assertEquals(6, game.getLives());

    }

}
