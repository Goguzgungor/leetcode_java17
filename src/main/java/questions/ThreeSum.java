package questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/3sum/description/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            int first = nums[i];
            for (int j = i+1; j < nums.length-1; j++) {
                int second = nums[j];
                for (int k = j+1; k < nums.length; k++) {
                    int third = nums[k];
                    if (first + second + third == 0){
                        List<Integer> triplet = List.of(first,second,third);
                        if (!result.contains(triplet)){
                            result.add(triplet);
                    }
                    }
                }
            }

        }
        return result;
    }
}
