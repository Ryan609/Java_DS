package nowCoder.BinaryTree;

/**
 *  二叉搜索树与双向链表
 *  https://www.nowcoder.com/practice/947f6eb80d944a84850b0538bf0ec3a5?tpId=13&&tqId=11179&rp=1&ru=/activity/oj&qru=/ta/coding-interviews/question-ranking
 * @author: xinyan
 * @data: 2022/05/18/15:56
 **/
public class JZ_36 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        TreeNode leftHead = Convert(pRootOfTree.left);
        TreeNode leftTail = leftHead;
        while (leftTail != null && leftTail.right != null) {
            leftTail = leftTail.right;
        }
        if (leftTail != null) {
            pRootOfTree.left = leftTail;
            leftTail.right = pRootOfTree;
        }
        TreeNode rightHead = Convert(pRootOfTree.right);
        if (rightHead != null) {
            rightHead.left = pRootOfTree;
            pRootOfTree.right = rightHead;
        }
        return leftHead == null ? pRootOfTree : leftHead;
    }
}
