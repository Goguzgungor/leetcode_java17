package questions;

public class LongestOnes {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount =0;
        int oneCount=-1;
        for (int right = 0; right <nums.length; right++) {
            if(nums[right]==0){
                zeroCount++;
            }
            while (zeroCount>k){
                if (nums[left] == 1) {
                    left++;
                } else if (nums[left] == 0) {
                    left++;
                    zeroCount --;
                }
            }
            System.out.println("left: "+left+"   rigth : "+right);
            oneCount= Math.max(oneCount,right-left);
        }
        return oneCount+1;
    }
}
