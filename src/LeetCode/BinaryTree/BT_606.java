package LeetCode.BinaryTree;

/**
 * 根据二叉树创建字符串
 * https://leetcode.cn/problems/construct-string-from-binary-tree/
 * @author: xinyan
 * @data: 2022/05/18/16:07
 **/
public class BT_606 {
    private StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        sb.append(root.val);
        if (root.left != null) {
            sb.append("(");
            tree2str(root.left);
            sb.append(")");
        } else {
            if (root.right != null) {
                sb.append("()");
            }
        }
        if (root.right != null) {
            sb.append("(");
            tree2str(root.right);
            sb.append(")");
        }
        return sb.toString();
    }
}
