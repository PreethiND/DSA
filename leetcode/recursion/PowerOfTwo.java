package leetcode.recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        // Base case: if n is 1, it's a power of two
        if (n == 1) return true;

        // If n is less than or equal to 0, it's not a power of two
        if (n <= 0) return false;

        // Recursive case: check if n is divisible by 2 and call the function with n / 2
        if (n % 2 == 0) return isPowerOfTwo(n / 2);

        // If n is not divisible by 2, it's not a power of two
        return false;
    }
}
