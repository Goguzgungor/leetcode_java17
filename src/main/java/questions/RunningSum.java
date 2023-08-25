package questions;

import java.util.HashMap;
//https://leetcode.com/problems/running-sum-of-1d-array/editorial
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            result[i]=sum;
        }
        return result;
    }

}
