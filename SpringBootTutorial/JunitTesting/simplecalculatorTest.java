package SpringBootTutorial.JunitTesting;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class simplecalculatorTest
{
    @Test
    public void sumNumTwo()
    {
        simplecalculator calcsum = new simplecalculator();
        assertEquals(10,calcsum.add(5,5));
    }
    @Test
    public void sum100()
    {
        simplecalculator calsum = new simplecalculator();
        assertTrue(calsum.add(50,50)==100);
    }
}