package uebungen;

import java.util.Scanner;

public class u01 {

    //Exercise 1-1 is a given Array sorted (ascending)?
    public static boolean isSorted(int[] a) {
        // Check every adjacent pair from index 0 up to the second-to-last element
        for (int i = 0; i < a.length - 1; i++) {
            // If we find even ONE pair in the wrong order, it's NOT sorted
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        // If the loop finished without finding any wrong pairs, the whole array is sorted!
        return true;
    }


    // -Exercise 1-2 Guessing Number

    // a) How many guesses does B need at most to win the game? Why?

    // 2^13 = 8,192, 2^14 = 16,384
    // 14 Answers are needed at most, since each wrong answer eliminates half of the remaining possible numbers
    // we can also use log2(10000)


    // b) Implement this game to allow a human as player B to play against the computer as player A
    public static void guessingNumber() {

// 1. Generate a random secret integer between 1 and 10000 (inclusive).
//    Math.random() * 10000 gives 0.0 to 9999.999..., (int) truncates to 0..9999,
//    and + 1 shifts the range to 1..10000.
        int randomNum = (int) (Math.random() * 10000) + 1;

// 2. Create a Scanner to read integer guesses typed by the user (B) in the terminal
        Scanner sc = new Scanner(System.in);

// 3. Initialize guess to 0 (outside the 1..10000 range) so the while loop is guaranteed to start
        int guess = 0;

// 4. Keep asking for new guesses until the player hits the exact secret number
        while (guess != randomNum) {
            System.out.println("Guess the Number: ");
            guess = sc.nextInt();

            if (guess > randomNum) {
                System.out.println("Too Large, guess again: ");
            } else if (guess < randomNum) {
                System.out.println("Too Small, guess again: ");
            } else {
                System.out.println("Correct Guess!");
            }
        }
    }

    //Exercise 1-3 Index
    //Implement a method int indexOf(int[] a, int n) which returns the one index i such that
    //a[i] == n. If no such index exists, the method should return -1. You can assume that the
    //parameter a[] is sorted.
    //What is the fastest way to achieve this task?
}