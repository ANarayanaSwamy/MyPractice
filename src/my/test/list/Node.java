package my.test.list;

public class Node {

	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

	public void print() {
		System.out.println(this);
	}

	public static Node createLinkList(int[] data) {
		Node root = null;
		Node curr = null;
		for (int value : data) {
			Node n = new Node(value);
			if (null == curr) {
				curr = n;
				root = n;
			} else {
				curr.next = n;
				curr = curr.next;
			}
		}
		return root;
	}

	public static void createLoop(Node root, int data) {
		Node target = null;
		Node last = null;
		while (root != null) {
			last = root;
			if(root.data == data)
			{
				 target = root;
			}
			root = root.next;
		}
		last.next = target;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = this;
		while (temp != null) {
			sb.append(temp.data + "-->");
			temp = temp.next;
		}
		sb.append("NULL");
		return sb.toString();
	}
}