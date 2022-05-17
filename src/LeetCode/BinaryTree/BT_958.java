package LeetCode.BinaryTree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个二叉树的 root ，确定它是否是一个 完全二叉树 。
 * @url: https://leetcode.cn/problems/check-completeness-of-a-binary-tree/
 * @author: xinyan
 * @data: 2022/05/16/16:34
 * @解题思路:
 * 判断完全二叉树分为两个阶段.
 * 第一阶段: 在该阶段下每个节点都有左右子树, 或第一个叶子节点. 当碰到第一个只有左子树没有右子树的节点就切换为第二阶段状态.
 *          当碰到一个节点只有右子树, 没有左子树直接return false; 找到反例
 * 第二阶段: 在该阶段下, 每个节点都是叶子节点, 若有节点有子树,直接return false;
 **/


public class BT_958 {
    public boolean isCompleteTree(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean secaondStep = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (!secaondStep) {
                if (node.left != null && node.right != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                } else if (node.left != null && node.right == null) {
                    secaondStep = true;
                    queue.offer(node.left);
                } else if (node.left == null && node.right != null) {
                    return false;
                } else if (node.left == null && node.right == null){
                    secaondStep = true;
                }
            } else {
                if (node.left != null || node.right != null) {
                    return false;
                }
            }
        }
        return true;
    }
}
