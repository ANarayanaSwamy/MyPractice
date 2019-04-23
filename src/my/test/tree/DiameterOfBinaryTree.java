package my.test.tree;

public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = TreeNode.createSampleTree();
		DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
		System.out.println(tree.diameter(root));
	}
	int diameter(TreeNode node){
		if(null == node){
			return 0;
		}
		int lDia = diameter(node.left);
		int rDia = diameter(node.right);
		
		int lHeight = height(node.left);
		int rHeight = height(node.right);
		return Math.max(1+lHeight+rHeight, Math.max(rDia, lDia));
	}
	int height(TreeNode node){
		if(null == node)
		{
			return 0;
		}
		int left = height(node.left);
		int right = height(node.right);
		return 1+Math.max(left,right);
	}
}
