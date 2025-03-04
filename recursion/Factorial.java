package recursion;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        System.out.println(factorialWithTailRecursion(n, 1));
    }

    //  Factorial without tail recursion
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //  Factorial with tail recursion
    public static long factorialWithTailRecursion(int n, int k) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialWithTailRecursion(n - 1, n * k);
    }
}
