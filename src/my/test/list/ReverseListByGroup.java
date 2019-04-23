package my.test.list;

public class ReverseListByGroup {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		n1.print();
		Node r = reverse(n1,2);
		r.print();
	}

	private static Node reverse(Node n1, int k) {
		Node current = n1;
		Node next = null;
		Node prev = null;
		int count = 0;
		while(count <k && current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if(next != null){
			n1.next = reverse(next, k);
		}
		return prev;
	}
}
