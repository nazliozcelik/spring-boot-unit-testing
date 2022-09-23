package com.luv2code.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    @Test
    @DisplayName("Divisible by 3")
    @Order(1)
    void testDivisibleByThree(){
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    @Test
    @DisplayName("Divisible by 5")
    @Order(2)
    void testDivisibleByFive(){
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    @Test
    @DisplayName("Divisible by 3 and 5")
    @Order(3)
    void testDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @Test
    @DisplayName("Not Divisible by 3 or 5")
    @Order(4)
    void testNotDivisibleByThreeOrFive(){
        String expected = "4";

        assertEquals(expected, FizzBuzz.compute(4), "Should return the number");
    }

    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @DisplayName("Testing with small data file")
    @Order(5)
    void testSmallDataFile(int value, String expected){
        assertEquals(expected, FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @DisplayName("Testing with medium data file")
    @Order(6)
    void testMediumDataFile(int value, String expected){
        assertEquals(expected, FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @DisplayName("Testing with large data file")
    @Order(7)
    void testLargeDataFile(int value, String expected){
        assertEquals(expected, FizzBuzz.compute(value));
    }
}
