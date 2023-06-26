package org.example;

import questions.LongestCommonPrefix;
import questions.RomanToInteger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String text = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(text);
    }
}