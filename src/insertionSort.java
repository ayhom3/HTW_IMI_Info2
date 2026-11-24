public class insertionSort {

    void move(int[] a, int k) {
        // Moves the element at index k to the front (index 0)
        // and shifts all elements before it one position to the right.

        int q = k;                   // Start our moving pointer at index k
        int temp = a[q];             // Save a backup of the value at index k before it gets overwritten

        // Loop backwards from k down to 1 (stops before 0 so q - 1 never goes out of bounds)
        while (q > 0) {
            a[q] = a[q - 1];         // Copy the left neighbor (q - 1) one slot to the right (into q)
            q = q - 1;               // Move the pointer one step to the left
        }

        a[0] = temp;                 // Place the saved value at the very front of the array (index 0)
    }
}
