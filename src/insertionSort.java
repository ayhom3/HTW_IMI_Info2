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

    void insert(int[] a, int k) {
        // Inserts the element at index k into its proper sorted position
        // within the already-sorted subarray to its left (indices 0 to k - 1).

        int q = k;                   // Start our moving pointer at index k
        int temp = a[q];             // Save a backup of the value we want to insert
        // Slide elements to the right as long as:
        // 1) q > 0 (we haven't reached the start of the array), AND
        // 2) a[q - 1] > temp (the element to the left is larger than temp)
        while (q > 0 && a[q - 1] > temp) {
            a[q] = a[q - 1];         // Shift the larger left neighbor one slot to the right
            q = q - 1;               // Move the pointer one step to the left
        }
        // Once the loop stops, q is the exact sorted slot where temp belongs
        a[q] = temp;                 // Drop the saved value into slot q
        }


    void insertionSort(int[] a) {
        // Sorts the array in ascending order using Insertion Sort
        // Start at king = 1 because a single element at index 0 is already "sorted"
        for (int king = 1; king < a.length; king++) {
            int jack = king;                 // Pointer that slides backwards to find temp's sorted slot
            int temp = a[jack];              // Save a backup of the value we want to insert

            // Keep sliding left while:
            // 1) jack > 0 (we haven't reached the front of the array), AND
            // 2) a[jack - 1] > temp (the neighbor on the left is larger than temp)
            while (jack > 0 && a[jack - 1] > temp) {
                a[jack] = a[jack - 1];       // Shift the larger left neighbor one slot to the right
                jack = jack - 1;             // Move the pointer one slot to the left
            }

            // Now jack is at the exact sorted position where temp belongs
            a[jack] = temp;                  // Drop the saved value into slot jack
        }
    }
    }
