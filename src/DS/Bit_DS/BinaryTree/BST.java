package DS.Bit_DS.BinaryTree;

import java.util.NoSuchElementException;

/**
 * @author: xinyan
 * @data: 2022/05/22/15:24
 **/
public class BST {
    private int size;
    private Node root;

    //添加一个元素
    public void add(int val) {
        root = add(root,val);
    }
    private Node add(Node root, int val) {
        if (root == null) {
            Node node = new Node(val);
            size ++;
            return node;
        }
        if (val < root.val) {
            root.left = add(root.left,val);
        }
        if (val > root.val) {
            root.right = add(root.right,val);
        }
        return root;
    }

    //查找一个元素
    public boolean findVal(int val) {
        return findVal(root,val);
    }
    private boolean findVal(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (val == root.val) {
            return true;
        } else if (val < root.val) {
            return findVal(root.left, val);
        } else  {
            return findVal(root.right, val);
        }
    }

    //查找BST中最小值
    public int finMin() {
        if (size == 0) {
            throw new NoSuchElementException("BST is empty");
        }
        return Min(root).val;
    }
    public Node Min(Node root) {
        if (root.left == null) {
            return root;
        }
        return Min(root.left);
    }

    //查找BST中最大值
    public int finMax() {
        if (size == 0) {
            throw new NoSuchElementException("BST is empty");
        }
        return Max(root).val;
    }
    public Node Max(Node root) {
        if (root.right == null) {
            return root;
        }
        return Max(root.right);
    }


    //删除BST中的最小值
    public int removeMin() {
        if (size == 0) {
            throw new NoSuchElementException("bst is empty!cannot remove");
        }
        Node minNode = Min(root);
        root = removeMin(root);
        return minNode.val;
    }
    private Node removeMin(Node root) {
        if (root.left == null) {
            Node right = root.right;
            root.left = root.right = root = null;
            size --;
            return right;
        }
        root.left = removeMin(root.left);
        return root;
    }

    //删除BST中的最大值
    public int removeMax() {
        if (size == 0) {
            throw new NoSuchElementException("bst is empty!cannot remove");
        }
        Node max = Max(root);
        root = removeMax(root);
        return max.val;
    }
    private Node removeMax(Node root) {
        if (root.right == null) {
            // root就是待删除的节点
            Node left = root.left;
            root.left = root.right = root = null;
            size --;
            return left;
        }
        // 此时root不是待删除的节点，待删除的节点一定在右子树
        root.right = removeMax(root.right);
        return root;
    }

    //删除值为val的元素
    public void remove(int val) {
        if (size == 0) {
            throw new NoSuchElementException("bst is empty!cannot remove");
        }
        root = remove(root,val);
    }
    private Node remove(Node root, int val) {
        if (root == null) {
            throw new NoSuchElementException("bst not has val");
        } else if(val < root.val) {
            root.left = remove(root.left, val);
            return root;
        } else if(val > root.val) {
            root.right = remove(root.right, val);
            return root;
        } else {
            Node successor = Min(root.right);
            successor.right = removeMin(root.right);
            successor.left = root.left;
            return successor;
        }
    }

    //按照先序遍历打印bst
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        generateBSTString(root,0,sb);
        return sb.toString();
    }

    private void generateBSTString(Node root, int height, StringBuilder sb) {
        if (root == null) {
            sb.append(generateHeightStr(height)).append("NULL\n");
            return;
        }
        sb.append(generateHeightStr(height)).append(root.val).append("\n");
        // 递归打印左子树
        generateBSTString(root.left,height + 1,sb);
        generateBSTString(root.right,height + 1,sb);
    }

    private String generateHeightStr(int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            sb.append("--");
        }
        return sb.toString();
    }
}

class Node {
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
    }
}
