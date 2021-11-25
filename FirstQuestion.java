import java.util.Arrays;

/**
 * We were asked to count the amount of reversed orders in array of integers telling us to use
 * divide and conquer method.
 * 
 * As we know MergeSort takes O(n*log(n)) TC,
 * so in other words: They want us to count the amount of swaps we do using MergeSort algorithm.
 */
class FirstQuestion{
   // Function to count the number of inversions
    // during the merge process
    private static int mergeAndCount(int[] arr, int l,int m, int r)
    {
 
        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
 
        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
 
        int i = 0, j = 0, k = l, swaps = 0;
 
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }
 
    // Merge sort function
    private static int reversedNumbersCounter(int[] arr, int l,int r)
    {
 
        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;
 
        if (l < r) {
            int m = (l + r) / 2;
 
            // Total inversion count = left subarray count
            // + right subarray count + merge count
 
            // Left subarray count
            count += reversedNumbersCounter(arr, l, m);
 
            // Right subarray count
            count += reversedNumbersCounter(arr, m + 1, r);
 
            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }
 
        return count;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 10,30,50,40,20 };
 
        System.out.println(reversedNumbersCounter(arr, 0, arr.length - 1));
    }
}

