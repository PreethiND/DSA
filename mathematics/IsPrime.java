package mathematics;

public class IsPrime {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("The given number - " + number + ", IsPrime : " + isPrime(number));
    }

    //    Brute Force
//    public static boolean isPrime(int number) {
//        if (number <= 1) return false;
//        for (int i = 2; i < number; i++) {
//            if ((number % i) == 0) return false;
//        }
//        return true;
//    }

    //    Optimized solution 1 (Iterate only till sqrt of n)
//    public static boolean isPrime(int number) {
//        if (number == 1) return false;
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) return false;
//        }
//        return true;
//    }

    //    Optimized solution 2 (additional checks to reduce the number of iteration n % 2 and n % 3)
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        // Check if n=2 or n=3
        if (number == 2 || number == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (number % 2 == 0 || number % 3 == 0)
            return false;

        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(number); i = i + 6){
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }
        return true;
    }
}

// Best - Optimized solution 2
