# How code slows, as data grows.

## Big-O Notation
*Time Complexity Quick Reference*

| Big-O | Name | Rating | How to Spot It in Java | Everyday Analogy |
| :--- | :--- | :--- | :--- | :--- |
| $O(1)$ | Constant | Excellent | Direct array access (`arr[i]`) or `HashMap.get()` | Grabbing a snack from a vending machine / pocket |
| $O(\log n)$ | Logarithmic | Good | Binary search (`Arrays.binarySearch()`) | Finding a word in a dictionary or phone book |
| $O(n)$ | Linear | Fair | A single loop (`for i = 0 to n`) | Reading every page of a book / finding a song |
| $O(n \log n)$ | Linearithmic | Bad | Sorting (`Arrays.sort()`), Merge / Quick sort | Organizing a deck of cards by dividing and merging |
| $O(n^2)$ | Quadratic | Poor | Nested loops (`for i`, inside `for j`) | Shaking hands with everyone in a crowded room |
| $O(n^3)$ | Cubic | Very Bad | Three nested loops (`i`, inside `j`, inside `k`) | Checking every 3D coordinate on a 3-layer grid / Rubik's puzzle combinations |
| $O(2^n)$ | Exponential | Horrible | Naive recursive Fibonacci, backtracking | Guessing every possible combination of a passcode, or folding a paper in half repeatedly |

---

## Four Important Rules

1. **Stacked blocks $\rightarrow$ Add (keep the biggest):**
   $$O(n) + O(n^2) = O(n^2)$$

2. **Nested blocks $\rightarrow$ Multiply:**
   $$O(n) \times O(\log n) = O(n \log n)$$

3. **Drop all constants:**
   $$O(5n) \rightarrow O(n), \quad O(\tfrac{1}{2}n^2) \rightarrow O(n^2)$$

4. **Different inputs = different letters:**
   Nested loops over `a` and `b` $\rightarrow O(n \cdot m)$