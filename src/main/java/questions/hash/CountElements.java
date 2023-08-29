package questions.hash;


import java.util.HashMap;

//https://leetcode.com/problems/counting-elements/
public class CountElements {

    public int countElements(int[] arr) {
        int count=0;
        HashMap<Integer, Integer> numHash = new HashMap<Integer,Integer>();
        for (int num : arr) {
            numHash.put(num,1);
        }
        for (int num : arr) {
            if(numHash.getOrDefault(num+1,0)==1){
                count++;
            }
        }
        return count;
    }
}
