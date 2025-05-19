public class Introduction {

    // Definition of an Array - List of Elements of the same type placed in a contiguous memory location  

    // Time Complexity:
    // 1 - Nested loops (like for loop inside another for loop): O(n^2)
    // 2 - Single loop without nesting: O(n)
    // 3 - Dividing the problem size by 2 repeatedly (like in binary search): O(log n)  // This is correct
    
}

// ---


// ### Explanation:

// #### 1. `O(n^2)` – **Nested Loops**

// Example:

// ```cpp
// for (int i = 0; i < n; i++) {
//     for (int j = 0; j < n; j++) {
//         // constant work
//     }
// }
// ```

// * The outer loop runs `n` times, and for each iteration, the inner loop also runs `n` times.
// * So total operations = `n * n = n²`

// ---

// #### 2. `O(n)` – **Single Loop**

// Example:

// ```cpp
// for (int i = 0; i < n; i++) {
//     // constant work
// }
// ```

// * Runs linearly with the size of `n`
// * Total operations = `n`

// ---

// #### 3. `O(log n)` – **Dividing by 2 each time**

// Example (Binary Search):

// ```cpp
// while (start <= end) {
//     mid = (start + end) / 2;
//     // narrow search space by half
// }
// ```

// * Each step reduces the problem size by half
// * Takes about `log₂(n)` steps

// ⚠️ Note: `n / 2` itself (once) is not O(log n) — but **repeated division by 2 in a loop** is what gives `O(log n)`.

// ---


