package questions.tree;


//https://leetcode.com/problems/minimum-depth-of-binary-tree/

// Bütün
public class MinDepth {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return this.getDepth(root,0);
    }


    public int getDepth(TreeNode root, int count ){
        count++;
        if (root==null){
            return Integer.MAX_VALUE;
        }

        if (root.right == null && root.left == null){
            return count;
        }

        int left = getDepth(root.left,count);
        int right = getDepth(root.right,count);
        return Math.min(left,right);
    }
}
