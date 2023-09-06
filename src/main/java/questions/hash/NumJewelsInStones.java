package questions.hash;

import java.util.HashMap;

public class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Boolean> numHash = new HashMap<Character,Boolean>();
        int jewelCount =0;
        for(int i=0;i<jewels.length();i++){
            numHash.put(jewels.charAt(i),true);
        }
        for(int i=0;i<stones.length();i++){
            boolean isJewel = numHash.getOrDefault(stones.charAt(i),false);
            if(isJewel){
                jewelCount++;
            }
        }
        return jewelCount;
    }
}
