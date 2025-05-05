import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorUnitTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(7, Calculator.add(3, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(56, Calculator.multiply(7, 8));
    }


    @Test
    public void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(15, 0);
        });
    }

    @Test
    public void testDivide() {
        assertEquals(3, Calculator.divide(15, 5));
    }


    @Test
    public void testSumOfArrays() {
        //setup
        int[] array = { 1, 4, 7, 9 };

        assertEquals(21, Calculator.returnSumOfArray(array));
        assertTrue(Calculator.returnSumOfArray(array) > 10, "Sum should be greater than 10");
    }
}