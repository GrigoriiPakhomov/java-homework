package test.java.fizzBuzz;

import main.java.fizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    void returnFizzBuzz(){

        assertEquals("FizzBuzz", FizzBuzz.getFizzBuzzValue(15));
    }

    @Test
    void returnFizz(){
        assertEquals("Fizz", FizzBuzz.getFizzBuzzValue(3));
    }

    @Test
    void returnBuzz(){
        assertEquals("Buzz", FizzBuzz.getFizzBuzzValue(5));
    }

    @Test
    void returnN(){
        assertEquals("7", FizzBuzz.getFizzBuzzValue(7));
    }
}
