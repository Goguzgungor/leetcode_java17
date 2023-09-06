package questions.hash;

import java.util.HashMap;


//https://leetcode.com/problems/longest-substring-without-repeating-characters
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxSize = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charMap.containsKey(c)) {
                start = Math.max(start, charMap.get(c) + 1);
            }
            charMap.put(c, i);
            maxSize = Math.max(maxSize, i - start + 1);
        }
        return maxSize;
    }
}
