package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
//        if n = 0 return 0
//        if n = 1 return 1
//        this can be written as n<=1 return n
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
