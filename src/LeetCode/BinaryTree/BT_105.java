package LeetCode.BinaryTree;

/**
 * 从前序与中序遍历序列构造二叉树
 * https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @author: xinyan
 * @data: 2022/05/17/17:36
 **/
public class BT_105 {
    private int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return buildHelper(preorder, inorder, 0, inorder.length-1);
    }

    private TreeNode buildHelper(int[] preorder, int[] inorder, int left, int right) {
        if (left > right) {
            return null;
        }
        if (index == preorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        index++;
        int pos = find(root.val, inorder);
        root.left = buildHelper(preorder, inorder, left, pos - 1);
        root.right = buildHelper(preorder, inorder, pos + 1,  right);
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
