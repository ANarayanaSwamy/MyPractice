package my.test.list;

import java.util.HashMap;

public class FindLoop {
	public static void main(String[] args) {
		int[] data = new int[] { 2, 3, 4, 5, 2 };
		Node root = Node.createLinkList(data);
		root.print();
		System.out.println(isLoop(root));
	}

	private static boolean isLoop(Node root) {
		boolean isLoop = false;
		HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();
		Node head = root;
		while (head != null) {
			if (nodes.get(head.data) != null) {
				isLoop = true;
				break;
			}
			nodes.put(head.data, head);
			head = head.next;
		}
		return isLoop;
	}
}
