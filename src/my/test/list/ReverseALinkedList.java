package my.test.list;

public class ReverseALinkedList {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		n1.print();
		Node r = reverse(n1);
		r.print();

	}

	private static Node reverse(Node n1) {
		Node current = n1;
		Node prev = null;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
