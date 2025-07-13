package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void test2() {
        System.out.println("This is a test method in Test2 class");
    }

    @Test
    void test3(int a) {
        System.out.println("This is a test method in Test2 class with parameter: " + a);
    }

    @Test
    void test4() {
        assertNotEquals(10, 5, "5 should not equal 10");
    }
}
