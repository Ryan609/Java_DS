package DS.BinaryTree;

/**
 * @author: xinyan
 * @data: 2022/09/19/22:42
 **/
public class 前中序构造二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         if (preorder == null || inorder == null || preorder.length != inorder.length) {
             return null;
         }
         return buildTreeHelp(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode buildTreeHelp(int[] preorder, int L1, int R1, int[] inorder, int L2, int R2) {
        if (L1 > R1) {
            return null;
        }
        TreeNode head = new TreeNode(preorder[L1]);
        if (L1 == R1) {
            return head;
        }
        int find = L2;
        while (inorder[find] != preorder[L1]) {
            find++;
        }
        head.left = buildTreeHelp(preorder, L1 + 1, L1 + find - L2, inorder, L2, find - 1);
        head.right = buildTreeHelp(preorder, L1 + find - L2 + 1, R1, inorder, find + 1, R2);
        return head;
    }
}
