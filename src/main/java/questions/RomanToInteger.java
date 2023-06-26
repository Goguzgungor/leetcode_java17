package questions;

import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer/?envType=featured-list&envId=top-100-liked-questions
public class RomanToInteger{
    public int romanToInt(String s) {
        int sum = 0;
        HashMap<String,Integer> romanMap = getRomanHashMap();
        HashMap<String,Integer> specailHashMap = specailHashMap();
        for (int i=0; i<s.length();i++){
            String romanChar= String.valueOf(s.charAt(i));
            if(i+1<s.length()){
                String nextChar = String.valueOf(s.charAt(i+1));
                String newVal = romanChar+nextChar;
                if (specailHashMap().containsKey(newVal)){
                    romanChar = newVal;
                    i++;
                }
            }
            System.out.println(romanChar);
            if (romanMap.containsKey(romanChar)){
                int value = romanMap.get(romanChar);
                sum += value;
            }
        }
        return sum;
    }
    public HashMap<String,Integer> getRomanHashMap ()
    {
        HashMap<String,Integer> romanMap = new HashMap<String,Integer>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);
        romanMap.put("IV",4);
        romanMap.put("IX",9);
        romanMap.put("XL",40);
        romanMap.put("XC",90);
        romanMap.put("CD",400);
        romanMap.put("CM",900);
        return romanMap;
    }
    public HashMap<String,Integer> specailHashMap ()
    {
        HashMap<String,Integer> romanMap = new HashMap<String,Integer>();
        romanMap.put("IV",4);
        romanMap.put("IX",9);
        romanMap.put("XL",40);
        romanMap.put("XC",90);
        romanMap.put("CD",400);
        romanMap.put("CM",900);
        return romanMap;
    }
}
