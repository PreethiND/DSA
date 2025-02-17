package mathematics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " using iterative method: " + getFactorial(n));
//        System.out.println("The factorial of " + n + " using recursive method: " + recFactorial(n));
    }

    //  Iterative solution
    protected static int getFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    //  Recursive solution
    static int recFactorial(int n) {
        if (n == 0)
            return 1;
        return n * recFactorial(n - 1);
    }
}

// Best approach -  Iterative
