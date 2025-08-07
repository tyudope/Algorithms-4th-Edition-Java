package chapter2_sorting.c2_1_elementary_sorts;

import java.sql.Time;
import java.util.Arrays;

//	•	Time Complexity:
//        •	Worst case: O(n²)
//	•	Average case: O(n²)
//	•	Best case: O(n²) → selection sort always performs the same number of comparisons.
//	•	Space Complexity: O(1) → in-place sort.
public class selection_sort {
    public static void main(String[] args) {

        int[] my_arr = {4,2,3,6,1,7,8,9};
        System.out.println("Before the sorting: " + Arrays.toString(my_arr));
        selectionSort(my_arr);
        System.out.println("After the sorting: " + Arrays.toString(my_arr));

    }
    public static void selectionSort(int[] givenArr){
        int n = givenArr.length;

        // outer loop: iterate through the entire array.
        for(int i = 0; i < n - 1; i++){
            int minIndex = i; // assume the current index holds the smallest value.

            // Inner loop: find the smallest element in the unsorted portion.
            for(int j = i + 1; j < n; j++){
                if (givenArr[j] < givenArr[minIndex]){
                    minIndex = j; // Update the index of the smallest element.
                }
            }
            if (i != minIndex){
                int temp = givenArr[i];
                givenArr[i] = givenArr[minIndex];
                givenArr[minIndex] = temp;
            }
        }
    }
}
