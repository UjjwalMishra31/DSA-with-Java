package SpringBootTutorial.JunitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryCatchNullArrayTest
{
    TryCatchNullArray actualarray = new TryCatchNullArray();
    @Test
    void sortarray()
    {
        try {
            int newarray[] = {4,9,1,6,7,3,10};
            int[] newsortedarray = actualarray.sortedarray(newarray);
            System.out.println(newarray);
            //assertArrayEquals();
        }
        catch (NullPointerException e)
        {
            System.out.println("Cannot accept a NULL Array");
        }
    }

}