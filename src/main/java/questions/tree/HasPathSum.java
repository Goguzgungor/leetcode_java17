package questions.tree;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return haspath(root, targetSum, 0);
    }

    public boolean haspath(TreeNode root, int k, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            sum = sum + root.val;
            if (sum == k) {
                return true;
            }

        }
        boolean left = haspath(root.left, k, sum + root.val);
        boolean rigth = haspath(root.right, k, sum + root.val);

        return (left || rigth);
    }
}
