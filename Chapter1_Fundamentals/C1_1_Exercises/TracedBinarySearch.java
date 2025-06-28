package Chapter1_Fundamentals.C1_1_Exercises;

import java.util.Arrays;

public class TracedBinarySearch {
    public static int rank(int key , int[] a){
        return rank(key , a , 0 , a.length - 1 , 0); // start recursion with depth 0
    }
    // Recursive method with tracing
    private static int rank(int key , int[] a, int lo , int hi , int depth){
        // print lo and hi with indentation based on depth
        String indent = " ".repeat(depth);
        System.out.println(indent + " lo : " + lo + ", hi: " + hi );

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]){
            return rank(key , a , lo , mid-1 , depth + 1);
        }
        else if( key > a[mid]){
            return rank (key , a , mid +1 , hi , depth + 1);
        }
        else{
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] whiteList = {1,3,5,7,9,11,13,15,17,19};
        Arrays.sort(whiteList);

        int key = 13;
        int result = rank(key , whiteList);

        if (result != -1){
            System.out.println("Key found at index : " + result);
        }
        else{
            System.out.println("Key not found.");
        }
    }
    // Output example for key 13
    //    lo : 0, hi: 9
    //    lo : 5, hi: 9
    //    lo : 5, hi: 6
    //    lo : 6, hi: 6
    //    Key found at index : 6

    // Time Complexity O(log N)
    // Binary search is 'divide and conquer' algorithm that works on sorted arrays.
    // The idea is;
    // 1. Look at the middle element.
    // 2. If it matches key, return the index.
    // 3. If the key is smaller, search the left half.
    // 4. If the key is larger, search the right half.
    // 5. Repeat until the range is empty
}
