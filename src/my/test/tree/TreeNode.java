package my.test.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeNode {
	TreeNode(int data) {
		this.data = data;
		this.right = null;
		this.left = null;

	}

	int data;
	TreeNode right;
	TreeNode left;

	/**
	 * <pre>
	 *    1
	 *  2   3
	 * 4 5
	 * </pre>
	 */
	public static TreeNode createSampleTree() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		return root;
	}

	/**
	 * <pre>
	 *    1
	 *  2   3
	 * 4 5 6 7
	 * </pre>
	 */
	public static TreeNode createBinaryTree() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		return root;
	}

	/**
	 * <pre>
	 *    1
	 *  2   3
	 * 4 5 6 7
	 * </pre>
	 */
	public static TreeNode createBinaryTree(int level) {
		TreeNode root = new TreeNode(1);
		int data = 2;
		List<TreeNode> currentLevelNodes = new ArrayList<TreeNode>();
		List<TreeNode> nextLevelNodes = new ArrayList<TreeNode>();
		currentLevelNodes.add(root);
		for (int i = 1; i < level; i++) {
			for(TreeNode node:currentLevelNodes){
				node.left = new TreeNode(data++);
				node.right = new TreeNode(data++);
				nextLevelNodes.add(node.left);
				nextLevelNodes.add(node.right);
			}
			currentLevelNodes.clear();
			currentLevelNodes.addAll(nextLevelNodes);
			nextLevelNodes.clear();
		}
		return root;
	}

	public void printTree() {
		StringBuilder sb = new StringBuilder();
		Queue<TreeNode> nodes = new LinkedBlockingQueue<TreeNode>();
		nodes.add(this);
		int levelSize = 1;
		int removedCount = 0;
		while (nodes.size() > 0) {
			TreeNode node = nodes.remove();
			removedCount++;
			if (node != null) {
				sb.append(node.data);
				sb.append(" ");
				if (node.left != null) {
					nodes.add(node.left);
				}
				if (node.right != null) {
					nodes.add(node.right);
				}
			}
			if(removedCount == levelSize){
				sb.append("\r\n");
				levelSize = nodes.size();
				removedCount = 0;
			}
		}
		System.out.println(sb);
	}


	public int getDepth() {
		int lDepth = 0;
		int rDepth = 0;
		if (null != left) {
			lDepth = 1 + left.getDepth();
		}
		if (null != right) {
			rDepth = 1 + right.getDepth();
		}
		return Math.max(lDepth, rDepth);
	}
}