package Chapter1_Fundamentals.C1_1_Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// EXERCISE CHAPTER 1.134
public class Filtering {

    public static void main(String[] args) {

        // Are they needs to full storage ->                            ANSWERS
//        ■ Print the maximum and minimum numbers.                      No
//        ■ Print the median of the numbers.                            YES
//        ■ Print the k th smallest value, for k less than 100.         YES
//        ■ Print the sum of the squares of the numbers.                NO
//        ■ Print the average of the N numbers.                         NO
//        ■ Print the percentage of numbers greater than the average.   YES
//        ■ Print the N numbers in increasing order.                    YES
//        ■ Print the N numbers in random order.                        YES

//        My strateddddgy for solving this problem is to take input numbers one by one from the user,
//        continuing until the user chooses to exit.
//        This simulates a streaming input scenario,
//        where the number of inputs (N) is not known in advance.

//        For each task listed,
//        I determine whether it can be implemented as a filter using only a fixed number of variables,
//        or whether it requires full storage of all input values (e.g., in an array).
//        If a task can be solved by processing each input on the fly without needing to remember previous values,
//        I treat it as a filter. Otherwise,
//        if the task requires access to all inputs at once (such as sorting or calculating a median),
//        I recognize that it needs full storage.
//       This method allows me to categorize each task
//       logically and decide how to implement it efficiently depending on its memory requirements.

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter numbers one by one. Enter 'Q' to quit.");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sumOfSquares = 0;
        double sum = 0;
        ArrayList<Integer> myArray = new ArrayList<>();

        // Input loop
        while (true) {
            System.out.print("Enter number: ");
            String input = s.next();
            if (input.equalsIgnoreCase("Q")) break;

            try {
                int n = Integer.parseInt(input);
                myArray.add(n);
                if (n > max) max = n;
                if (n < min) min = n;
                sumOfSquares += n * n;
                sum += n;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'Q' to quit.");
            }
        }

        // Edge case: no input
        if (myArray.isEmpty()) {
            System.out.println("No numbers were entered.");
            return;
        }

        // max, min
        System.out.println("\nMaximum number: " + max);
        System.out.println("Minimum number: " + min);

        // Sort array for median, kth smallest, increasing order
        Collections.sort(myArray);

        // median
        printMedian(myArray);

        // k-th smallest value
        int k = 7;
        printKthSmallest(myArray, k);

        // sum of squares
        System.out.println("Sum of squares: " + sumOfSquares);

        // average
        double average = sum / myArray.size();
        System.out.printf("Average: %.2f\n", average);

        // percentage of numbers greater than average
        printPercentageAboveAverage(myArray, average);

        // Increasing order
        System.out.println("\nNumbers in increasing order:");
        for (int value : myArray) {
            System.out.println("Integer: " + value);
        }

        // Random order
        Collections.shuffle(myArray);
        System.out.println("\nNumbers in random order:");
        for (int value : myArray) {
            System.out.println("Integer: " + value);
        }
    }

    // Prints the median of a sorted list
    private static void printMedian(ArrayList<Integer> list) {
        int n = list.size();
        if (n % 2 != 0) {
            System.out.println("Median: " + list.get(n / 2));
        } else {
            int mid1 = list.get(n / 2);
            int mid2 = list.get(n / 2 - 1);
            double median = (mid1 + mid2) / 2.0;
            System.out.println("Median: " + median);
        }
    }

    // Prints the k-th smallest element (0-based index)
    private static void printKthSmallest(ArrayList<Integer> list, int k) {
        if (k < list.size()) {
            System.out.printf("(%d)th smallest value: %d\n", k, list.get(k));
        } else {
            System.out.printf("Cannot find the %dth smallest value. Only %d numbers entered.\n", k, list.size());
        }
    }

    // Prints the percentage of values greater than the average
    private static void printPercentageAboveAverage(ArrayList<Integer> list, double average) {
        int count = 0;
        for (int value : list) {
            if (value > average) count++;
        }
        double percentage = ((double) count / list.size()) * 100;
        System.out.printf("Percentage of numbers greater than average: %.2f%%\n", percentage);
    }
}
