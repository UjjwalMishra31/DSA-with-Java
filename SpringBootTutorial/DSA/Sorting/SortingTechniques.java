package SpringBootTutorial.DSA.Sorting;

public class SortingTechniques
{
    public static  void NewSelectionSort(int[] arrays)
    {
        int length = arrays.length;
        int smallestvalue = 0;
        int tempVariable = 0;
        for (int i = 0 ; i < length ; i++)
        {
            smallestvalue = i;
            for (int j = i + 1 ; j < length ; j++)
            {
                if (arrays[j] < arrays[smallestvalue])
                {
                    smallestvalue = j;
                }
            }
            tempVariable = arrays[i];
            arrays[i] = arrays[smallestvalue];
            arrays[smallestvalue] = tempVariable;

        }
    }
    public static void BubbleSort(int[] arrays)
    {
        int temp = 0;
        // Before sortig values
        for (int i = 0; i< arrays.length ; i++)
        {
            for (int j = 0; j < arrays.length -1 ; j++)
            {
                if (arrays[j] > arrays[j+1])
                {
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arrays = {19,2,15,4,18,10,6,1};
        int[] arrays1 = {19,2,15,4,18,10,6,1};
        System.out.println("Array before sorting ");
        for (int num : arrays)
        {
            System.out.print(num + " ");
        }
        BubbleSort(arrays);
        System.out.println();
        System.out.println("Bubble Sort sorted array: ");
        for (int num : arrays)
        {
            System.out.print(num + " ");
        }
        NewSelectionSort(arrays1);
        System.out.println();
        System.out.println("Selection Sort sorted array: ");
        for (int num : arrays1)
        {
            System.out.print(num + " ");
        }
    }
}
