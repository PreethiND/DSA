package hackerraank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class BalancedSum {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 8, 11);
        System.out.println(balancedSums(list));
    }

    public static String balancedSums(List<Integer> list) {
        // Compute total sum of the array
        int totalSum = 0;
        for (int num : list) {
            totalSum += num;
        }

        int leftSum = 0;
        // Calculate right sum dynamically
        for (int num : list) {
            int rightSum = totalSum - leftSum - num;

            // Check if leftSum == rightSum at the current index
            // Found equilibrium index
            if (leftSum == rightSum) return "YES";

            // Update left sum for the next iteration
            leftSum += num;
        }
        // No equilibrium index found
        return "NO";
    }
}
