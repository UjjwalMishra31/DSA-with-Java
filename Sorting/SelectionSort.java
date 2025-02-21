package Sorting;

public class SelectionSort
{
    public static void SortSelection(int[] arr)
    {
        int n = arr.length;
        for ( int i = 0 ; i < n-1 ; i++ )
        {
            // total number of iterations
            int smallest = i;
            for (int j = i+1 ; j<n ; j++)
            {    // this if is finding smallest value in the iteration
                if (arr[j] < arr[smallest])            // 7 < 8
                {

                    smallest = j;                         //    smallest = 1 [8]
                }
            }
            int tempvar = arr[i];                 //          7
            arr[i] = arr[smallest];               //   8
            arr[smallest] = tempvar;                  //      7
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
