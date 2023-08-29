package questions.hash;

import java.util.HashMap;


//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> numHash = new HashMap<>();
        for (int num : nums) numHash.put(num,1);

        int mapSize = numHash.size();
        for(int i=0; i<mapSize ; i++ ){
            if(numHash.getOrDefault(i,0) == 0){
                return i;
            }
        }
        return mapSize;
    }
}
