import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.ArrayList;
//static imports all access to static methods from Assertion class

public class CalculatorTest{
	
	@BeforeAll
    public static void runBeforeAll(){
        System.out.println("Running before all tests.");
    }

    @AfterAll
    public static void runAfterAll(){
        System.out.println("Running after all tests.");
    }

    @BeforeEach
    public void runBeforeEach(){
        System.out.println("Run before each test.");
    }

    @AfterEach
    public void runAfterEach(){
        System.out.println("Run after each test.");
    }

    @Test
    public void testAdd(){
        assertTrue(true);
    }

    @Test
    public void testSubtract(){
        assertTrue(true);
    }

    @Test
    public void testMultiply(){
        assertTrue(true);
    }

    @Test
    public void testDivide(){
        assertTrue(true);
    }

    @Test 
    public void testFactorial(){
        assertEquals(1, Calculator.factorial(1));
        assertTrue(2 == Calculator.factorial(2));
        assertFalse(6 > Calculator.factorial(3));
        assertNotEquals(10, Calculator.factorial(3));
        assertEquals(24, Calculator.factorial(4));
        assertEquals(120, Calculator.factorial(5));

        assertEquals(4.0, 4.1, 0.2);
    }



    @Test
    public void testQuadratic(){
        String[][] answer = {{"-0.200", "-1.000"},
                            {"-0.167 + 0.986i","-0.167 - 0.986i"}};
        assertArrayEquals(answer[0], Calculator.quadratic(5, 6, 1));
        //-0.167 + 0.986i, -0.167 + 0.986i
        assertArrayEquals(answer[1], Calculator.quadratic(3, 1, 3));
    }

    @Test
    public void testMean(){
        int[] k = {3,2,3,4};//3
        assertTrue(3==Calculator.mean(k));
    }

    @Test
    public void testVariance(){
        int[] k = {3,2,3,4};
        assertEquals(0.5, Calculator.variance(k));
    }

    @Test
    public void testStandardDeviation(){
        int[] k = {3,2,3,4};
        assertTrue(0.706 < Calculator.standardDeviation(k));
        assertTrue(0.708 > Calculator.standardDeviation(k));
        assertEquals(0.707, Calculator.standardDeviation(k), 0.2);
    }

}