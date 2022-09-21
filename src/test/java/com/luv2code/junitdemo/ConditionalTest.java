package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Test
    @Disabled("Don't run until JIRA#123 is resolved")
    void basicTest(){
        //execute method and perform assets
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly(){
        //execute method and perform assets
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly(){
        //execute method and perform assets
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly(){
        //execute method and perform assets
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){
        //execute method and perform assets
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyJava17(){
        //execute method and perform assets
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testOnlyForJava13(){
        //execute method and perform assets
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_18)
    void testOnlyForJavaRange(){
        //execute method and perform assets
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testForOnlyJavaRangeMin(){
        //execute method and perform assets
    }
}
