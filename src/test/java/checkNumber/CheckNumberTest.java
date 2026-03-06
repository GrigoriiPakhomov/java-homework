package test.java.checkNumber;

import main.java.checkNumber.CheckNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CheckNumberTest {
        @Test
        void returnTrue(){
            assertTrue(CheckNumber.checkPower(8));
        }

        @Test
        void returnFalse(){
            assertFalse(CheckNumber.checkPower(50));
        }

    }

