package Bit_DS.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        MyBinaryTree bt = new MyBinaryTree();
        bt.build();
        //bt.levelOrder(bt.root);
//        System.out.println();
//        System.out.println(bt.getNodeNonRecursion(bt.root));
        System.out.println(bt.preOrderNonRe(bt.root));
        System.out.println(bt.inOrderNonre(bt.root));
    }
}
