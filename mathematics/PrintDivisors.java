package mathematics;

public class PrintDivisors {
    public static void main(String[] args) {
        int n = 25;
        printDivisors(n);
    }

    //    Brute Force
//    public static void printDivisors(int n) {
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i + " ");
//            }
//        }
//    }

    //   Optimized solution (iterate till sqrt of n ex 4*4 = 16 which is > given number 12)
    //   The Result will not be sorted
//    public static void printDivisors(int n) {
//        for (int i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//                // If divisors are equal, print only one (as in case of 5 * 5)
//                if (n / i == i)
//                    System.out.print(" " + i);
//
//                else // Otherwise print both
//                    System.out.print(i + " " + n / i + " ");
//            }
//        }
//    }

    //    Optimized solution (get the result in sorted order)
    public static void printDivisors(int n) {
        int i;
//        Print all divisors from 1 - sqrt N
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
//        Print all divisors from sqrt N to N
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.print((n / i) + " ");
            }
        }
    }
}
