package Bit_DS.BinaryTree;

/**
 * @author: xinyan
 * @data: 2022/05/22/15:38
 **/
public class BstTest {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(28);
        bst.add(16);
        bst.add(30);
        bst.add(13);
        bst.add(22);
        bst.add(29);
        bst.add(42);
        bst.add(40);
        System.out.println(bst.finMax());
    }

}
