package mathematics;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = 12;
        getPrimeFactors(number);
    }

    //    Brute Force
//    public static void getPrimeFactors(int number) {
//        if (number <= 1) return;
//        for (int i = 2; i < number; i++) {
//            while ((number % i) == 0) {
//                System.out.print(i + " ");
//                number = number / i;
//            }
//        }
//        if (number > 1) System.out.println(number + " ");
//    }

//    Optimized solution 1 (Iterate only till sqrt of n)
//    public static void getPrimeFactors(int number) {
//        if (number <= 1) return;

    /// /        for (int i = 2; i <= Math.sqrt(number); i++) {
//        for (int i = 2; i * i <= number; i++) {
//            while ((number % i) == 0) {
//                System.out.print(i + " ");
//                number = number / i;
//            }
//        }
//        if (number > 1) System.out.println(number + " ");
//    }

//    Optimized solution 2 (Check divisibility by 2 and 3
    public static void getPrimeFactors(int number) {
        if (number <= 1) return;
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number = number / 2;
        }
        while (number % 3 == 0) {
            System.out.print(3 + " ");
            number = number / 3;
        }

        for (int i = 5; i * i <= number; i = i + 6) {
            while ((number % i) == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
            while ((number % (i + 2)) == 0) {
                System.out.print((i + 2) + " ");
                number = number / (i + 2);
            }
        }
        if (number > 3) System.out.print(number + " ");
    }
}
