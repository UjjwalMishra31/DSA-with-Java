package SpringBootTutorial.DSA;

public class SearchingTechniques
{
    public static void main(String[] args)
    {
        //int[] array = {2,3,7,8,11,14,17,19,20,21,25,28,29};
        int[] array = {2,3,7,8,11};
        int target = 11;
        System.out.println(array.length);
        linearsearch(array,target);
        binarysearch(array,target);

    }

    private static int binarysearch(int[] array, int target)
    {
        // 2,3,7,8,11
        //   tgt : 11
        int left = 0;
        int right = array.length-1;
        int count = 0;
        while (left <= right)
        {
            int mid = (right + left ) / 2;
            count ++;
            if (array[mid]== target)
            {
                System.out.println("Element found at index : "+ left);
                System.out.println("Count was : "+count);
                return left;
            } else if (array[mid] < target)
            {
                left = mid +1;
            }
            else
            {
                right = mid - 1;
            }

        }
        System.out.println("Element not found.");
        return -1;
    }

    // linear search method
    // iterate to each vale one by one
    public static int linearsearch(int[] array, int target)
    {
        for (int i = 0 ; i<array.length ; i++)
        {
            if (array[i] == target)
            {
                System.out.println("Element found at Index : "+i);
                return i;
            }
        }
        System.out.println("Element not found");
        // if element not available in array , then return -1
        return -1 ;
    }
}
