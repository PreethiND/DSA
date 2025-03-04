package mathematics;

public class SieveOfErastothenes {
    public static void main(String[] args) {
        sieveOfEratosthenes(9);
    }

    public static void sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            // If prime[i] is not changed to false, then it is prime
            if (prime[i]) {
                // Update all multiples of i greater than or
                // equal to the square of it numbers which
                // are multiple of i and are less than i^2
                // are already been marked.
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        // Print all prime numbers the elements whose value is still True
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}