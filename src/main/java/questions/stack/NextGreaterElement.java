package questions.stack;

import java.util.Arrays;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] greaterElementList = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int greaterElement = -1;
            int element = nums1[i];
            int indexofElement = getIndexOfElement(nums2, element);
            for (int j = indexofElement; j < nums2.length; j++) {
                int nextElement = nums2[j];
                if (nextElement>element){
                    greaterElement = nextElement;
                    break;
                }
            }
                    greaterElementList[i] = greaterElement;
        }
        return greaterElementList;
    }

    public int getIndexOfElement(int[] nums2, int element){
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i]==element){
                return i;
            }
        }
        return -1;
    }
}