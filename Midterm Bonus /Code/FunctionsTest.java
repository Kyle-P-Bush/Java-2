import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionsTest{

    @BeforeAll
    public static void runBeforeAll(){
        System.out.println("Beginning to run tests...");
    }

    @AfterAll
    public static void runAfterAll(){
        System.out.println("All tests are complete!");
    }

    @BeforeEach
    public void runBeforeEach(){
        System.out.println("Test running...");
    }

    @AfterEach
    public void runAfterEach(){
        System.out.println("Test ran.");
    }

    @Test 
    public void testFunction01ForZero(){
        assertEquals("Invalid numbers: Cannot input 0 for any value.", Functions.function01(0,0,0));
        assertEquals("Invalid numbers: Cannot input 0 for any value.", Functions.function01(1,0,0));
        assertEquals("Invalid numbers: Cannot input 0 for any value.", Functions.function01(0,1,0));
        assertEquals("Invalid numbers: Cannot input 0 for any value.", Functions.function01(0,0,1));
        assertEquals("Invalid numbers: Cannot input 0 for any value.", Functions.function01(1,1,0));
        assertEquals("Invalid numbers: Cannot input 0 for any value.", Functions.function01(1,0,1));
        assertEquals("Invalid numbers: Cannot input 0 for any value.", Functions.function01(0,1,1));
    }

    @Test
    public void testFunction01Negative(){
        assertEquals("1.500", Functions.function01(-1,-1,-1));
        assertEquals("0.625", Functions.function01(-2,-2,-2));
        assertEquals("0.389", Functions.function01(-3,-3,-3));
    }

    @Test
    public void testFunction01Positive(){
        assertEquals("0.500", Functions.function01(1,1,1));
        assertEquals("0.125", Functions.function01(2,2,2));
        assertEquals("0.056", Functions.function01(3,3,3));
    }


}