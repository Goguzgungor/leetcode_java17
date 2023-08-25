package questions.arrrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAverages {
    public int[] getAverages(int[] nums, int k) {
        if (k==0){
            return  nums;
        }
        int[] sumList = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
        int sublistSum=0;
            int element = nums[i];
            if(i+k >=nums.length){
                sumList[i]=-1;
                continue;
            }
            if (k>i){
                sumList[i]=-1;
                continue;
            }
            for (int j = i-k; j <= i+k; j++) {
                sublistSum+= nums[j];
            }
            sumList[i]= sublistSum/((2*k)+1);
        }

        return sumList;
    }
}
