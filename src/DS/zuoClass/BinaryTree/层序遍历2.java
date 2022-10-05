package DS.zuoClass.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: xinyan
 * @data: 2022/09/20/10:23
 * https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/
 **/
public class 层序遍历2 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> curAns = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                curAns.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            ans.add(0, curAns);
        }
        return ans;
    }
}
