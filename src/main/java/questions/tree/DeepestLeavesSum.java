package questions.tree;

import java.util.HashMap;

public class DeepestLeavesSum {
    private HashMap<Integer, Integer> map = new HashMap<>();
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = this.findDeepest(root, 0);
        return map.getOrDefault(depth-1,0);
    }

    public int findDeepest(TreeNode root, int level) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            map.put(level, map.getOrDefault(level, 0) + root.val);
        }
        int left =findDeepest(root.left, level + 1);
        int right =findDeepest(root.right, level + 1);
        return Math.max(left, right) + 1;
    }
}
