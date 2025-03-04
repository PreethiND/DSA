package hackerraank.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMax_Sum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        miniMaxSum(list);
    }

    public static void miniMaxSum(List<Integer> list) {
        // Write your code here
        long totalSum = 0;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        // Single loop to find sum, min, and max
        for (int num : list) {
            totalSum += num; // Calculate total sum
            minElement = Math.min(minElement, num); // Track minimum element
            maxElement = Math.max(maxElement, num); // Track maximum element
        }

        // Min sum excludes maxElement, Max sum excludes minElement
        long minSum = totalSum - maxElement;
        long maxSum = totalSum - minElement;

        // Print results
        System.out.println(minSum + " " + maxSum);
    }
}
