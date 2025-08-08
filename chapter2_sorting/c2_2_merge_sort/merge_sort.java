package chapter2_sorting.c2_2_merge_sort;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] my_arr = {8,2,5,3,4,7,6,1};
        System.out.println("Before the sorting "  + Arrays.toString(my_arr));
        mergeSort(my_arr);
        System.out.println("After the sorting: " + Arrays.toString(my_arr));
    }


    // Recursive merge sort function
    public static void mergeSort(int[] array){

        // Store the length of the array.
        int length = array.length;

        // Base case: if the array has 1 or no elements, it is already sorted
        if(length <= 1) return;

        // Find the middle index to split the array
        int middle = length / 2;

        // Create a subarrays for left and right halves.
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // Initialize loop indices for left and right arrays.
        int i = 0; // for leftArray
        int j = 0; // for rightArray

        // Copy values into leftArray and rightArray
        for(; i < length; i++){
            if (i < middle){
                leftArray[i] = array[i]; // Fill the left half.
            }
            else{
                rightArray[j] = array[i]; // Fill the right half.
                j++;
            }
        }
        // Recursively sort the left and right values.
        mergeSort(leftArray);
        mergeSort(rightArray);

        // merge the sorted halves back into the original array.
        merge(leftArray , rightArray , array);
    }

    // helper method to merge two sorted arrays into the original array.
    public static void merge(int[] leftArray , int[] rightArray , int[] array){
        // Calculate the size of left and right arrays.
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        // Initialize index pointers for each array
        int i = 0; // index for merged array
        int l = 0; // index for leftArray
        int r = 0; // index for rightArray

        // Compare elements from both arrays and insert the smaller into 'array'
        while (l < leftSize && r < rightSize){

            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l]; // take from the left
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r]; // take from the right
                i++;
                r++;
            }
        }
        // Copy remaining elements from leftArray, if any
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        // Copy remaining elements from rightArray, if any
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
