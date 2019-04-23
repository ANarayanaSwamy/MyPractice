package my.test.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class SumOfOddAndEvenLevels {
	static class LeveledNode {
		TreeNode node;
		int level;

		public LeveledNode(TreeNode node, int level) {
			this.node = node;
			this.level = level;
		}
	}

	public static void main(String[] args) {
		TreeNode treeNode = TreeNode.createBinaryTree(5);
		treeNode.printTree();
		Queue<LeveledNode> queue = new LinkedBlockingQueue<LeveledNode>();
		queue.add(new LeveledNode(treeNode, 0));
		int oddSum = 0;
		int evenSum = 0;
		while (queue.size() > 0) {
			// Add children
			LeveledNode node = queue.remove();
			TreeNode front = node.node;
			if (front != null) {
				if (front.left != null) {
					queue.add(new LeveledNode(front.left, node.level + 1));
				}
				if (front.right != null) {
					queue.add(new LeveledNode(front.right, node.level + 1));
				}
				// System.out.println(front.data);
				if (node.level % 2 == 0) {
					evenSum += front.data;
				} else {
					oddSum += front.data;
				}
			}
		}
		System.out.println(evenSum - oddSum);
	}
}
