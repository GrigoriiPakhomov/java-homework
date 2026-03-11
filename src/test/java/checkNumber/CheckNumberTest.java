package test.java.checkNumber;

import main.java.checkNumber.CheckNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CheckNumberTest {
    @Test
    void returnTrue() {
        assertTrue(CheckNumber.checkPower(8));
    }

    @Test
    void returnFalse() {
        assertFalse(CheckNumber.checkPower(50));
    }

    @Test
    void returnTrueForBigInt() {
        assertTrue(CheckNumber.checkPower(2147483647));
    }

    @Test
    void shouldReturnFalseForZero() {
        assertFalse(CheckNumber.checkPower(0));
    }

    @Test
    void shouldReturnFalseForNegative() {
        assertFalse(CheckNumber.checkPower(-1));
    }

}

