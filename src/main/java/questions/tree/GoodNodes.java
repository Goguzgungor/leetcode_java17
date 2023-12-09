package questions.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/count-good-nodes-in-binary-tree/
public class GoodNodes {
    int count =1;
    public int goodNodes(TreeNode root) {
        if (root == null){
            return count;
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        countGoodNodes(root.left,list);
        countGoodNodes(root.right,list);
        return count;
    }
    public void countGoodNodes(TreeNode node, List<Integer> list) {
        if (node != null) {
            int prevMax = getMaxElementInList(list);
            if (node.val >= prevMax) {
                count++;
            }
            List<Integer> rightList = new ArrayList<>(list);
            rightList.add(node.val);
            countGoodNodes(node.right, rightList);

            List<Integer> leftList = new ArrayList<>(list);
            leftList.add(node.val);
            countGoodNodes(node.left, leftList);
        }
    }
    public int getMaxElementInList(List<Integer> list){
        int max = Integer.MIN_VALUE;
        for (Integer o : list) {
            if ((int) o > max) {
                max = (int) o;
            }
        }
        return max;
    }
}
