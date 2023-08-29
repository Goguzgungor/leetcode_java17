package questions.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> numHash = new HashMap<Integer,Integer>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            int[] subList = nums[i];
            if(i == (nums.length-1)){
                for(int num:subList){
                    int count = numHash.getOrDefault(num,0);
                    if(i == count){
                        arrayList.add(num);
                    }
                }
            }
            for(int num:subList){
                int count = numHash.getOrDefault(num,0);
                numHash.put(num,count+1);
            }
        }
        arrayList.sort(Integer::compareTo);
        return arrayList;
    }
}
