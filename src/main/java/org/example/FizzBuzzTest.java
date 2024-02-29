package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testIsFizz_ShouldReturnFizzForMultipleOfThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);
    }
    @Test
    public void testIsBuzz_ShouldReturnBuzzForMultipleOfFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void testIsFizzBuzz_ShouldReturnFizzBuzzForMultipleOfThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }
    @Test
    public void testIsNumber_ShouldReturnNumberAsStringForOtherCases() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(4);
        assertEquals("4", result);
    }
}

