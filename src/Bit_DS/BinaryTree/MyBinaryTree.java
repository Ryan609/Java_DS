package Bit_DS.BinaryTree;

class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}

public class MyBinaryTree {
    TreeNode root;

    public void build() {
        TreeNode node = new TreeNode('A');
        TreeNode node1 = new TreeNode('B');
        TreeNode node2 = new TreeNode('C');
        TreeNode node3 = new TreeNode('D');
        TreeNode node4 = new TreeNode('E');
        TreeNode node5 = new TreeNode('F');
        TreeNode node6 = new TreeNode('G');
        TreeNode node7 = new TreeNode('H');
        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node6;
        node6.right = node7;
        node2.right = node5;
        root = node;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + ",");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + ",");
        inOrder(root.right);

    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + ",");
    }
}
