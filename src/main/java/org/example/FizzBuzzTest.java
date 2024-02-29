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
}

