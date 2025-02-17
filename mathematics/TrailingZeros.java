package mathematics;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Count of trailing 0s in " + n
                + "! is "
                + getTrailingZeros(n));
    }

    // Brute force
    protected static int getTrailingZerosBF(int n) {
        int trailingZeros = 0;
        int factorial = Factorial.getFactorial(n);
        System.out.println("Factorial of " + n + " is : " + factorial);
        while(factorial % 10 == 0){
            trailingZeros++;
            factorial = factorial / 10;
        }
        return trailingZeros;
    }

    protected static int getTrailingZeros(int n) {
        int trailingZeros = 0;
        int factorial = Factorial.getFactorial(n);
        System.out.println("Factorial of " + n + " is : " + factorial);
            for (int i = 5; i <= factorial; i = i * 5) {
            trailingZeros = trailingZeros + (n / i);
        }
        return trailingZeros;
    }
}

// Trailing 0s in n! = Count of 5s in prime factors of n! = floor(n/5) + floor(n/25) + floor(n/125) + ....
