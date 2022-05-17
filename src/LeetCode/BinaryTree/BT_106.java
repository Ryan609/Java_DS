package LeetCode.BinaryTree;

/**
 * 从中序与后序遍历序列构造二叉树
 * https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * @author: xinyan
 * @data: 2022/05/17/17:54
 **/
public class BT_106 {
    private int index = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildHelper(inorder, postorder, 0, inorder.length-1);
    }

    private TreeNode buildHelper(int[] inorder, int[] postorder, int left, int right) {
        if (left > right) {
            return null;
        }
        if (index == postorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[index]);
        index++;
        int pos = find(root.val, inorder);
        root.right = buildHelper(inorder, postorder, pos + 1,  right);
        root.left = buildHelper(inorder, postorder, left, pos - 1);
        return root;
    }

    private int find(int val, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

}
