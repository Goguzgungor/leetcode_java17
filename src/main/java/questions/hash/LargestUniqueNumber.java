package questions.hash;


import java.util.HashMap;

//https://leetcode.com/problems/largest-unique-number/
public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer,Integer> numHash = new HashMap<Integer,Integer>();
        int maxUnique = -1;

        for(int num:nums){
            int count = numHash.getOrDefault(num,0);
            numHash.put(num,count+1);
        }
        for(int num:nums){
            int count = numHash.get(num);
            if(count == 1){
                maxUnique = Math.max(num,maxUnique);
            }
        }
        return maxUnique;
    }
}
