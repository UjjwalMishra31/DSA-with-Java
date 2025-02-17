package SpringBootTutorial.JunitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAssertionTest
{
    ArraysAssertion newarray = new ArraysAssertion();
    @Test
    void newarrays()
    {
        assertArrayEquals(newarray.GetArray1(),newarray.GetArray2());
    }

}