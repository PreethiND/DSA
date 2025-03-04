package leetcode.recursion;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = -1;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        // Base case: if n is 1, it's a power of three
        if (n == 1) return true;

        // If n is less than or equal to 0, it's not a power of three
        if (n <= 0) return false;

        // Recursive case: check if n is divisible by 3 and call the function with n / 3
        if (n % 3 == 0) return isPowerOfThree(n / 3);

        // If n is not divisible by 3, it's not a power of three
        return false;
    }
}
    