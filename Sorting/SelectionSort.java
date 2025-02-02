package Sorting;

public class SelectionSort
{
    public static void SortSelection(int[] arr)
    {
        int n = arr.length;
        for (int i =0; i<n-1 ; i++)
        {
            // total number of iterations
            int smallest = i;
            for (int j = i+1 ; j<n ; j++)
            {    // this if is finding smallest value in the iteration
                if (arr[j] < arr[smallest])
                {

                    smallest = j;
                }
            }
            int tempvar = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = tempvar;
        }

    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        SortSelection(arr);
        for (int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
