package test.java.FixString;

import main.java.invalidString.FixString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FixStringTest {
    @Test
    void returnEmptyString() {
        String input = "";
        assertEquals("", FixString.fixString(input));

    }

    @Test
    void returnNull(){
        assertEquals(null, FixString.fixString(null));
    }

    @Test
    void returnStringl(){
        String input = "ечвтрег";
        assertEquals("четверг", FixString.fixString(input));
    }
}
