package questions.tree;

public class MaxDepth {


    //https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int rigth = maxDepth(root.right);

        return Math.max(left,rigth)+1;
    }

}
