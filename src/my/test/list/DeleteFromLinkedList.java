package my.test.list;

public class DeleteFromLinkedList {
	public static void main(String[] args) {
		int[] data = new int[] { 2, 3, 4, 5, 2 };
		Node root = Node.createLinkList(data);
		root.print();
		delete(root,5).print();
	}

	private static Node delete(Node root,int data) {
		Node pt1 = root;
		Node pt2 = root;
		while(pt1 != null){
			if(pt1.data == data)
			{
				pt2.next = pt1.next;
				break;
			}
			pt2 = pt1;
			pt1 = pt1.next;
		}
		return root;
	}
}
