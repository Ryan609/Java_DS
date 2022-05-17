package Bit_DS.BinaryTree;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


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

    public List<Character> preOrderNonRe(TreeNode root) {
        List<Character> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.poll();
            ret.add(cur.val);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
        return ret;
    }

    public List<Character> inOrderNonre(TreeNode root) {
        List<Character> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ret.add(cur.val);
            cur = cur.right;
        }
        return ret;
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

    public List<Character> PostOrderNonre(TreeNode root) {
        List<Character> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (cur.right == null || cur.right == prev) {
                ret.add(cur.val);
                prev = cur;
                cur = null;
            } else {
                stack.push(cur);
                cur = cur.right;
            }
        }
        return ret;
    }

    public int getNode(TreeNode root) {
        return root == null ? 0 : 1 + getNode(root.left) + getNode(root.right);
    }

    /**
     * 统计一棵树有多少个节点 非递归
     * @param root
     * @return
     */
    public int getNodeNonRecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int size = 0;
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        while (!dq.isEmpty()) {
            TreeNode node = dq.poll();
            size++;
            if (node.left != null) {
                dq.offer(node.left);
            }
            if (node.right != null) {
                dq.offer(node.right);
            }
        }
        return size;
    }

    public int getLeafNode(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNode(root.left) + getLeafNode(root.right);
    }

    public int getKLevelNode(TreeNode root, int k) {
        if (root == null || k <= 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelNode(root.left, k - 1) + getKLevelNode(root.right, k - 1);
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean getVal(TreeNode root,char val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        return getVal(root.left, val) || getVal(root.right,val);
    }

    /**
     * 层序遍历非递归写法
     * @param root
     */
    public void levelOrder(TreeNode root) {
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        while (!dq.isEmpty()) {
            int n = dq.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = dq.poll();
                System.out.print(node.val + " ");
                if (node.left != null) {
                    dq.offer(node.left);
                }
                if (node.right != null) {
                    dq.offer(node.right);
                }
            }
        }
    }


}
