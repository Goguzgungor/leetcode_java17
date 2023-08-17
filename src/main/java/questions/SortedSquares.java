package questions;

import java.util.Arrays;
//https://leetcode.com/problems/squares-of-a-sorted-array
public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        nums = Arrays.stream(nums).map(operand -> operand * operand).toArray();
        Arrays.sort(nums);
        return nums;
    }
}
