package Bit_DS.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        MyBinaryTree bt = new MyBinaryTree();
        bt.build();
        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
    }
}