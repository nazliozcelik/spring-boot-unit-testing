package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    DemoUtils demoUtils;
    @BeforeEach
    void setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach(){
        System.out.println("Running @AfterEach\n");
    }

    @BeforeAll
    static void setupBeforeAll(){
        System.out.println("@BeforeAll executes only once before all test methods execution in the class\n");
    }

    @AfterAll
    static void tearDownAfterAll(){
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }

    @Test
    @DisplayName("Equals or Not Equals")
    void testEqualsOrNotEquals(){

        System.out.println("Running test: testEqualsAndNotEquals");

        //DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2,4),"2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1,9), "1+9 must not be 6");
    }

    @Test
    @DisplayName("Null or Not Null")
    void testNullOrNotNull(){

        System.out.println("Running test: testNullAndNotNull");

        //DemoUtils demoUtils = new DemoUtils();

        String str = "test";

        assertNull(demoUtils.checkNull(null), "Object should be null");
        assertNotNull(demoUtils.checkNull(str), "Object should not be null");
    }

    @Test
    @DisplayName("Same or Not Same")
    void testSameOrNotSame(){

        String str = "test";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to same object");
        assertNotSame(str, demoUtils.getAcademy(),"Objects should not refer to same object");
    }

    @Test
    @DisplayName("True or False")
    void testTrueOrFalse(){
        int number1 = 10;
        int number2 = 5;

        assertTrue(demoUtils.isGreater(number1,number2), "This should return true");
        assertFalse(demoUtils.isGreater(number2,number1), "This should return false");

    }
}
