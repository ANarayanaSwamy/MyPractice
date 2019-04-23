package my.test.tree;

public class DistanceFromRoot {
	public static void main(String[] args) {
		TreeNode binaryTree = TreeNode.createBinaryTree();
		System.out.println(findDistance(binaryTree,6));
	}

	private static int findDistance(TreeNode node, int nodeValue) {
		if(null == node){
			return -1;
		}
		if(node.data == nodeValue)
		{
			return 1;
		}
		int leftDistance = 1+findDistance(node.left, nodeValue);
		int rightDistance = 1+findDistance(node.right, nodeValue);
		return Math.min(leftDistance, rightDistance);
	}
}
