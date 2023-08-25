package questions;

import java.util.Arrays;
import java.util.List;

public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double avarageMax = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < nums.length; i++) {
            if (i+k>nums.length){
                break;
            }
            double avagareTemp= (Arrays.stream(Arrays.copyOfRange(nums,i,i+k)).sum()) ;
            avagareTemp= avagareTemp/k;
            if (avagareTemp>avarageMax){
                avarageMax=avagareTemp;
            }
        }
        return avarageMax;
    }
}
