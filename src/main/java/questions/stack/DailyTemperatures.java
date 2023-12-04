package questions.stack;


//https://leetcode.com/problems/daily-temperatures

import java.util.Stack;

//Input: temperatures = [73,74,75,71,69,72,76,73]
        //Output: [1,1,4,2,1,1,0,0]
 public class DailyTemperatures{
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length-1; i++) {
            int count = 0;
            int element = temperatures[i];
            for (int j = i+1; j < temperatures.length; j++) {
                    count++;
                if(temperatures[j]>element){
                    break;
                }
                    if (j == temperatures.length-1){
                        count=0;
                    }

            }
            result[i] = count;
        }
        return result;
    }


    //more optimized solution
    public int[] moreOptimizedDailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }

        return result;
    }
}