package org.example;


import questions.*;
import questions.arrrays.GetAverages;
import questions.arrrays.MinStartValue;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GetAverages getAverages = new GetAverages();
        int[] sumList = getAverages.getAverages(new int[]{40527,53696,10730,66491,62141,83909,78635,18560},2);

        for (int i = 0; i < sumList.length; i++) {
            System.out.println(sumList[i]);
        }
    }
}