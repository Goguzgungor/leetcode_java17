package questions.hackkerrank;


import java.util.List;
//https://www.hackerrank.com/challenges/plus-minus/problem

public class Plusminus {
    public static void plusMinus(List<Integer> arr) {
        double zeroCount = 0;
        double positiveCount = 0;
        double negativeCount =0 ;
        for(int element : arr){
            if(element == 0){
                zeroCount++;
            }
            else if (element > 0){
                positiveCount++;
            }
            else if (element < 0){
                negativeCount++;
            }
        }

        System.out.println(
                String.format("%.6f", positiveCount/arr.size()));
        System.out.println(
                String.format("%.6f", negativeCount/arr.size()));
        System.out.println(
                String.format("%.6f", zeroCount/arr.size()));



    }

}
