package mathematics;

public class IterativePower {
    public static void main(String[] args) {
        int n = 2, pow = 3;
        System.out.println("The result of " + n + " raised to the power of " + pow + " is: " + getIterativePower(n, pow));
    }

    public static int getIterativePower(int n, int pow) {
        int res = 1;
        while (pow > 0) {
            // If pow is odd,
            // multiply
            // n with result
            if (pow % 2 != 0) res = res * n;
            n = n * n; // Change n to n^2
            pow = pow / 2;
        }
        return res;
    }
}
