package questions.tree;

//https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
public class MaxAncestorDiff {
    private int maxDiff = 0;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }

        calculateDiff(root, root.val, root.val);
        return maxDiff;
    }

    private void calculateDiff(TreeNode root, int maxVal, int minVal) {
        if (root == null) {
            return;
        }

        maxDiff = Math.max(maxDiff, Math.abs(maxVal - root.val));
        maxDiff = Math.max(maxDiff, Math.abs(minVal - root.val));

        maxVal = Math.max(maxVal, root.val);
        minVal = Math.min(minVal, root.val);

        calculateDiff(root.left, maxVal, minVal);
        calculateDiff(root.right, maxVal, minVal);
    }
}
