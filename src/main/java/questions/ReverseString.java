package questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public void reverseString(char[] s) {
        List<Character> characterList = new ArrayList<>();
        for (int i = s.length-1; i >= 0; i--) {
            char element = s[i];
            characterList.add(element);
        }
        System.out.println(characterList);
    }

}
