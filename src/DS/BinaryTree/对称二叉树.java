package DS.BinaryTree;

/**
 * @author: xinyan
 * @data: 2022/09/19/21:50
 * https://leetcode.cn/problems/symmetric-tree/
 **/
public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null ^ right == null) {
            return false;
        }
        if (left == null && right == null) {
            return true;
        }
        return left.val == right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
