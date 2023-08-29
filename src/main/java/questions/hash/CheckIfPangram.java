package questions.hash;

import java.util.HashMap;


//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> charHash = new HashMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < sentence.length(); i++) {
            Character element = sentence.charAt(i);
            charHash.putIfAbsent(element,1);
        }

        for (int i = 0; i < alphabet.length; i++) {
            int elementVal = charHash.getOrDefault(alphabet[i],0);
            if (elementVal ==0){
                return  false;
            }
        }
        return true;
    }
}
