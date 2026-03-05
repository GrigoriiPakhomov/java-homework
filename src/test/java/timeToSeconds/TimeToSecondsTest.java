package test.java.timeToSeconds;

import main.java.timeToSeconds.TimeToSeconds;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TimeToSecondsTest {

    @Test
    void testValidInput(){
        assertEquals(764, TimeToSeconds.toSeconds("12:44"));
        assertEquals(30, TimeToSeconds.toSeconds("00:30"));
    }

    @Test
    void testSecondsTooLarge() {
        assertThrows(IllegalArgumentException.class,
                () -> TimeToSeconds.toSeconds("1:60"));
    }

    @Test
    void testNegativeValues() {
        assertThrows(IllegalArgumentException.class,
                () -> TimeToSeconds.toSeconds("-1:10"));
    }
}
