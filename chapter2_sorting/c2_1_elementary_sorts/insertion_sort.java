package chapter2_sorting.c2_1_elementary_sorts;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] my_arr = {4,2,3,6,1,7,8,9};
        System.out.println("Before the sorting "  + Arrays.toString(my_arr));
        insertionSort(my_arr);
        System.out.println("After the sorting: " + Arrays.toString(my_arr));
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;

        // outer loop: Go through each element in the array starting from index 1
        for (int i = 1; i < n; i++){
            // Store the current element to insert into the sorted left portion
            int curr = arr[i];

            // Set j to the index of the last element in the sorted portion ( left side of i )
            int j = i - 1;

            // Inner loop: Shift elements in the sorted portion to the right
            // as long as they're greater than the current value.

            while(j >= 0 && arr[j] > curr){
                arr[j+1] = arr[j]; // shift element to the right
                j--; // move the left to continue comparing.
            }
            arr[j+1] = curr; // Insert the current value into the correct position in the sorted portion.

        }

    }
}
