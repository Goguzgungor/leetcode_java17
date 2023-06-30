package org.example;
import java.util.Collections;

import questions.ThreeSum;
import questions.sumoftwo.ListNode;
import questions.sumoftwo.SumOfTwo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(new int[]{1,-1,-1,0}));
    }
}