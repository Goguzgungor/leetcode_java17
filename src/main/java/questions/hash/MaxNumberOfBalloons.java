package questions.hash;

import java.util.HashMap;

public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> charHash = new HashMap<Character,Integer>();
        char[] balloonList = {'b','a','l','o','n'};
        int count = 0;
        int realCount= Integer.MAX_VALUE;
        for(int i=0; i< text.length();i++){
            char element = text.charAt(i);
            if(element == 'b' || element == 'a' || element == 'l' || element == 'o' || element == 'n'){
                count = charHash.getOrDefault(element,0);
                charHash.put(element,count+1);
            }
        }
        for(char element : balloonList){
            int temp = 0;
            if(element  == 'l'){
                temp = charHash.getOrDefault(element,0)/2;
                realCount= Math.min(realCount,temp);
            }
            else if(element == 'o'){
                temp = charHash.getOrDefault(element,0)/2;
                realCount= Math.min(realCount,temp);
            }
            else{
                temp = charHash.getOrDefault(element,0);
                realCount= Math.min(realCount,temp);
            }
        }

        return realCount;
    }

}
