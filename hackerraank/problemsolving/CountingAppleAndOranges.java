package hackerraank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class CountingAppleAndOranges {

    public static void main(String[] args) {
        int s = 7, t = 10, a = 4, b = 12;
        List<Integer> apples = new ArrayList<>();
        apples.add(2);
        apples.add(3);
        apples.add(-4);
        List<Integer> oranges = new ArrayList<>();
        oranges.add(3);
        oranges.add(-2);
        oranges.add(-4);

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int applesInRangeCount = 0;
        int orangesInRangeCount = 0;

        // Count apples that land on the house
        for (int apple : apples) {
            int distance = apple + a;
            if ((distance >= s) && (distance <= t)) {
                applesInRangeCount++;
            }
        }

        // Count oranges that land on the house
        for (int orange : oranges) {
            int distance = orange + b;
            if ((distance >= s) && (distance <= t)) {
                orangesInRangeCount++;
            }
        }

        System.out.print(applesInRangeCount + "\n" + orangesInRangeCount);
    }
}
