package LeetCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * https://leetcode.cn/problems/binary-tree-preorder-traversal/
 * @解题思路: 将每个节点加入到创建的list中, 但是list创建要在方法外面, 如果在方法里,每次递归都会创建新的list.
 * 如果root为空, 直接返回list.
 */

public class BT_144 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
         list.add(root.val);
         preorderTraversal(root.left);
         preorderTraversal(root.right);
         return list;
    }
}
