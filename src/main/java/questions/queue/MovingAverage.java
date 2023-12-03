package questions.queue;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/moving-average-from-data-stream
public class MovingAverage {
    private int size;
    private List<Integer> integers = new ArrayList<>();
    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        int sum = 0;
        integers.add(val);
        int checkedsize = integers.size();
        if (checkedsize>size){
            checkedsize=size;
        }
        for (int i=integers.size()-1; i>=0;i-- ) {
            int element = integers.get(i);
            sum += element;
            if (i==(integers.size()-size)){
             break;
            }
        }
        return (double) sum /checkedsize;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */