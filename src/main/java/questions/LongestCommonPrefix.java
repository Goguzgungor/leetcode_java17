package questions;

//https://leetcode.com/problems/longest-common-prefix/?envType=featured-list&envId=top-100-liked-questions

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String shortestString = strs[0];
        String commonPrefix = "";
        for (int i = 0; i < shortestString.length() ; i++) {
            String prefix = shortestString.substring(0,i+1);
            boolean isCommonPrefix = true;
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)){
                    isCommonPrefix = false;
                    break;
                }
            }
            if (isCommonPrefix){
                commonPrefix = prefix;
            }
        }
        return commonPrefix;
    }
}
