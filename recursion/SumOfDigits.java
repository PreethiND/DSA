package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    //    Note: This is the better approach compared to recursion
    public static int sumOfDigitsIterative(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }


}
