package hackerraank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        int d = 3;
        int m = 2;
        System.out.println(birthday(s, d, m));
    }
//  Brute Force
//    public static int birthday(List<Integer> s, int d, int m) {
//        // Write your code here
//        int noOfWays = 0;
//
//        for (int i = 0; i <= s.size() - m; i++) {
//            int sum = 0;
//            for (int j = i; j <= m - 1 + i; j++) {
//                sum += s.get(j);
//            }
//            if (sum == d) {
//                noOfWays++;
//            }
//        }
//        return noOfWays;
//    }

    //    Using Sliding Window approach
    public static int birthday(List<Integer> s, int d, int m) {
        int noOfWays = 0;
        int sum = 0;

        // Compute the sum of the first 'm' elements
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        // Check if the initial sum matches 'd'
        if (sum == d) {
            noOfWays++;
        }

        // Slide the window across the list
        for (int i = m; i < s.size(); i++) {
            sum += s.get(i);       // Add the next element in the window
            sum -= s.get(i - m);   // Remove the first element of the previous window

            // Check the sum after each slide
            if (sum == d) {
                noOfWays++;
            }
        }
        return noOfWays;
    }
}
