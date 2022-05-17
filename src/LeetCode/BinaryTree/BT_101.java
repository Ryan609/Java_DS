package LeetCode.BinaryTree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 对称二叉树
 * https://leetcode.cn/problems/symmetric-tree/submissions/
 * @解题思路:
 * 1. 首先判断左子树和右子树的值是否相等,
 * 2. 左子树的左子树和右子树的右子树是否镜像相等.
 * 3. 左子树的右子树和右子树的左子树是否镜像相等
 * 三个条件同时满足
 */

public class BT_101 {
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        return isMirror(root.left, root.right);
//    }
//
//    private boolean isMirror(TreeNode t1, TreeNode t2) {
//        //如果两棵树的根节点都是null说明后面没有子树了 返回true.
//        if (t1 == null && t2 == null) {
//            return true;
//        }
//        //其中一个还有根节点, 说明不对称直接返回false.
//        if (t1 == null || t2 == null) {
//            return false;
//        }
//        return t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
//    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Deque<TreeNode> queue = new LinkedList();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if (t1 == null && t2 == null) {
                continue;
            }
            if (t1 == null || t2 == null) {
                return false;
            }
            if (t1.val != t2.val) {
                return false;
            }
            queue.offer(t1.left);
            queue.offer(t2.right);
            queue.offer(t1.right);
            queue.offer(t2.left);
        }
        return true;
    }
}
