package uebungen;

import java.util.Arrays;

import static uebungen.u01.*;

public class Main {
    public static void main(String[] args) {

    //  Test u01-1
        int [] isArraySorted = {10, 5, 20, 30 ,40 ,50};
        int [] duplicated = {5, 5, 30 ,40 ,50};

        System.out.println(isSorted(isArraySorted));
        System.out.println(isSorted(duplicated));


    //  Test u01-2
         // u01.guessingNumber();
         //  int randomNum = (int) (Math.random() * 10000) + 1;
         //  generates a random number between 1-10000


    //  Test u01-3
        int[] numbers = {10, 20, 30, 40, 50};
        // 1. Target in the middle (Best Case)
        System.out.println("Index of 30: " + indexOf(numbers, 30)); // Expected: 2

        // 2. Target at the boundaries (first and last elements)
        System.out.println("Index of 10: " + indexOf(numbers, 10)); // Expected: 0
        System.out.println("Index of 50: " + indexOf(numbers, 50)); // Expected: 4

        // 3. Target not in the array (smaller, larger, and in-between)
        System.out.println("Index of 5:  " + indexOf(numbers, 5));  // Expected: -1
        System.out.println("Index of 60: " + indexOf(numbers, 60)); // Expected: -1
        System.out.println("Index of 25: " + indexOf(numbers, 25)); // Expected: -1

        // 4. Edge case: empty array
        int[] empty = {};
        System.out.println("Index in empty array: " + indexOf(empty, 10)); // Expected: -1

    // Test u01-4
        System.out.println("sum from 0 to N: " + sum(10));
        System.out.println("sum from 0 to N: " + sum(100));
        System.out.println("sum from 0 to N: " + sum(1000));
    }

}