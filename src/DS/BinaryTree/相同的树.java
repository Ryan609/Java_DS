package DS.BinaryTree;

/**
 * @author: xinyan
 * @data: 2022/09/19/21:37
 * https://leetcode.cn/problems/same-tree/
 **/
public class 相同的树 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null ^ q == null) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
