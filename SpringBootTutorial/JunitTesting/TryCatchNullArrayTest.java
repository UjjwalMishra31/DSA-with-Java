package SpringBootTutorial.JunitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryCatchNullArrayTest
{
    TryCatchNullArray actualarray = new TryCatchNullArray();
    @Test
    void sortarray() {
        int[] sortedArray = null; // store array which is going to get sorted now
        int[] array2 = null;// store original array already sorted
        try
        {
            //int array1[] = null;
            int array1[] = {4, 9, 1, 6, 7, 3, 10};
            array2 = new int[]{1, 3, 4, 6, 7, 9, 10};
            sortedArray = actualarray.sortedarray(array1);
            System.out.println("Remember! Try block is getting executed as no null array is provided.");
            // printing array {sorted}
            for (int n : sortedArray)
            {
                System.out.println(n);
            }
        }
        // if user enters null array then it will get executed
        catch (NullPointerException e)
        {
            System.out.println("Cannot accept a NULL Array");
        }
        assertArrayEquals(array2, sortedArray);
    }

}