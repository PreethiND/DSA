package mathematics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("The digits of " + n + " are: " + countDigits(n));
        countDigits(n);
    }
    static int countDigits(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
}
