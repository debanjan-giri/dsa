public class Recursion {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println(result);

    }

    // does not support the concept of "nested methods."
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

// Example Execution for factorial(5):
// factorial(5) → 5 * factorial(4)
// factorial(4) → 4 * factorial(3)
// factorial(3) → 3 * factorial(2)
// factorial(2) → 2 * factorial(1)
// factorial(1) → 1 (Base case)