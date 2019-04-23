package my.test.tree;

public class FindLeastCommonAncestor {
	public static void main(String[] args) {
		TreeNode binaryTree = TreeNode.createBinaryTree();
		System.out.println(findLCA(binaryTree, 4, 5).data);
		System.out.println(findLCA(binaryTree, 4, 6).data);
		System.out.println(findLCA(binaryTree, 3, 4).data);
		System.out.println(findLCA(binaryTree, 2, 4).data);
	}

	private static TreeNode findLCA(TreeNode node, int n1, int n2) {
		if(node == null){
			return null;
		}
		if(node.data == n1 || node.data == n2){
			return node;
		}
		
		TreeNode lLCA = findLCA(node.left, n1, n2);
		TreeNode rLCA = findLCA(node.right, n1, n2);
		if(lLCA != null && rLCA != null){
			return node;
		}
		return lLCA != null ? lLCA:rLCA;
	}
}
