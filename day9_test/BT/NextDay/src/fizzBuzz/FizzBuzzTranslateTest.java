package fizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FizzBuzzTranslateTest {
        @Test
        @DisplayName("lessThanZero")
        void testCase1(){
            int number = -1;
            boolean expected = FizzBuzzTranslate.numberCondition(number);
            assertFalse(expected);
        }

    @Test
    @DisplayName("Fizz")
    void testCase2(){
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Buzz")
    void testCase3(){
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("FizzBuzz")
    void testCase4(){
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("bay")
    void testCase5(){
        int number = 7;
        String expected = "bay";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("bay bay")
    void testCase6(){
        int number = 77;
        String expected = "bay bay";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("input3x")
    void testCase7(){
        int number = 32;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("input5x")
    void testCase8(){
        int number = 52;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
}


