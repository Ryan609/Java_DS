package DS.BinaryTree;

/**
 * @author: xinyan
 * @data: 2022/09/19/22:00
 **/
public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
