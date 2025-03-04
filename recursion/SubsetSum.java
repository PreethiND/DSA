package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 5};
        int sum = 25, i = 0;
//        System.out.println(subsetCount(arr, sum, i));
        System.out.println(subsetSum(arr, sum, i));
    }

    //  Program to print the count of subsets that that sum to the target sum
    public static int subsetCount(int[] arr, int sum, int i) {
        if (sum == 0) return 1;
        if (sum < 0) return 0;
        if (i == arr.length) return 0;

        return subsetCount(arr, sum - arr[i], i + 1) + subsetCount(arr, sum, i + 1);
    }

    // Recursive method to find all subsets that sum to the target sum
    public static List<List<Integer>> subsetSum(int[] arr, int sum, int i) {
        List<List<Integer>> subsets = new ArrayList<>();

        // Base case: If sum is 0, return a list with an empty subset
        if (sum == 0) {
            subsets.add(new ArrayList<>());
            return subsets;
        }

        if (i == arr.length || sum < 0) {
            return subsets;
        }

        // Include the current element arr[i] and recurse
        List<List<Integer>> include = subsetSum(arr, sum - arr[i], i + 1);
        for (List<Integer> subset : include) {
            subset.add(0, arr[i]);
        }
        subsets.addAll(include);

        // Exclude the current element arr[i] and recurse
        List<List<Integer>> exclude = subsetSum(arr, sum, i + 1);
        subsets.addAll(exclude);

        return subsets;

    }
}
