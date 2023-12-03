package questions.queue;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/number-of-recent-calls/
class RecentCounter {
    private ArrayList<Integer> integers = new ArrayList<>();
    public RecentCounter() {
        integers = new ArrayList<>();
    }

    public int ping(int t) {
        int count = 0;
        int low = t - 3000;
        integers.add(t);
        for (int element : integers) {
            if (low <= element && element <= t) {
                count++;
            }
        }
        return count;
    }
}