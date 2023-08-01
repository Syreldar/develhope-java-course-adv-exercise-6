import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest
{
    @Test
    public void testSubtraction()
    {
        System.out.println("Testing subtraction...");
        assertEquals(3, MathOperations.subtraction(5, 2), "5 - 2 should equal 3");
        assertEquals(-1, MathOperations.subtraction(2, 3), "2 - 3 should equal -1");
        System.out.println("Subtraction tests passed!\n");
    }

    @Test
    public void testMultiplication()
    {
        System.out.println("Testing multiplication...");
        assertEquals(10, MathOperations.multiplication(5, 2), "5 * 2 should equal 10");
        assertEquals(0, MathOperations.multiplication(0, 3), "0 * 3 should equal 0");
        System.out.println("Multiplication tests passed!\n");
    }
}