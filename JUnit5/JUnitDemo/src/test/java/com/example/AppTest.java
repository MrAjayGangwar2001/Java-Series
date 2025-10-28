

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testApp() {
        assertTrue(true, "Basic test should pass");
    }

    @Test
    void  demo() {
        assertEquals(5, 2 + 2, "2 + 2 should equal 4");  // This String text will be printed if the test fails
    }

    @Test
    void test(){
        System.out.println("Hello, World!");
    }
    @Test
    void test1(){
        System.out.println("This is Another test for printing something");
        int x = 19;
        if (x >= 18) {
            System.out.println("You can Take Your Decision by Self");
        } else {
            System.out.println("You can't take Decision by self! and You are under Parents Care");
        }
    }

}
