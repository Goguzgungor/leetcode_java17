package questions.arrrays;

public class MinStartValue {
    public int minStartValue(int[] nums) {
        int sum= 0;
        int minVal =1 ;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            sum += element;
            if(0>sum){
                minVal= Math.max((sum*(-1)+1),minVal);
            }
        }
        return minVal;
    }
}
