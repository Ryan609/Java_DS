package DS.zuoClass.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class 将N叉树编码为二叉树 {
    
    public static class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};
	// 提交时不要提交这个类
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

    class Codec {
		// Encodes an n-ary tree to a binary tree.
		// public TreeNode encode(Node root) {
		// 	if (root == null) {
        //         return null;
        //     }
        //     TreeNode head = new TreeNode(root.val);
        //     head.left = en(root.children);
        //     return head;
		// }

		// private TreeNode en(List<Node> children) {
		// 	TreeNode head = null;
        //     TreeNode cur = null;
        //     for (Node child : children) {
        //         TreeNode tNode = new TreeNode(child.val);
        //     }
		// }

		// // Decodes your binary tree to an n-ary tree.
		// public Node decode(TreeNode root) {
		// 	return null;
		// }

		// public List<Node> de(TreeNode root) {
		// 	return null;
		// }

	}

}
