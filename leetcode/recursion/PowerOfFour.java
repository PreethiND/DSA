package leetcode.recursion;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        // Base case: if n is 1, it's a power of four
        if (n == 1) return true;

        // If n is less than or equal to 0, it's not a power of four
        if (n <= 0) return false;

        // Recursive case: check if n is divisible by 4 and call the function with n / 4
        if (n % 4 == 0) return isPowerOfFour(n / 4);

        // If n is not divisible by 4, it's not a power of four
        return false;
    }
}
