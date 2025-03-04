package mathematics;

public class RecursivePower {
    public static void main(String[] args) {
        int n = 2;
        int pow = 5;
        System.out.println(computePower(n, pow));
    }
//  Brute Force
//    public static int computePower(int n, int pow) {
//        int result = 1;
//        for (int i = pow; i >= 1; i--) {
//            result *= n;
//        }
//        return result;
//    }

//    Recursion
//    formula
//    power(x, n) = power(x, n / 2) * power(x, n / 2);        // if n is even
//    power(x, n) = x * power(x, n / 2) * power(x, n / 2);    // if n is odd

    public static int computePower(int n, int pow) {
        int temp;
        if (pow == 0) return 1;
        temp = computePower(n, pow / 2);
        if (pow % 2 == 0)
            return temp * temp;
        else
            return n * temp * temp;
    }
}
