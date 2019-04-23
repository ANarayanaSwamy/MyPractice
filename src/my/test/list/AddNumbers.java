package my.test.list;

public class AddNumbers {
	public static void main(String[] args) {
		Node node1 = Node.createLinkList(new int[] { 1,8 });
		Node node2 = Node.createLinkList(new int[] { 0});

		System.out.println(add(node1, node2));
	}

	private static Node add(Node node1, Node node2) {
		Node res = null;
		Node n1Ref = node1;
		Node n2Ref = node2;
		Node current = res;
		int carry = 0;
		while (n1Ref != null) {
			int sum = n1Ref.data + n2Ref.data;
			int nodeVal = (sum % 10) + carry;
			carry = sum / 10;

			Node newNode = new Node(nodeVal);
			if (res == null) {
				res = newNode;
				current = res;
			} else {
				current.next = newNode;
				current = current.next;
			}
			System.out.println(res);
			n1Ref = n1Ref.next;
			n2Ref = n2Ref.next;
			if(n2Ref == null) {
				break;
			}
		}
		while(n1Ref != null) {
			
		}
		
		if(n2Ref != null){
            while(n2Ref != null){
            int sum = 0+n2Ref.data;  
            Node newNode = new Node(sum%10 + carry);
            if(null == res){
            	current = newNode;
                res = current;
            }else{
            	current.next = newNode;
            	current = current.next;
            }
            carry = sum/10;
            n2Ref = n2Ref.next; 
            }
        }
        if(carry != 0){
        	current.next = new Node(carry);
        }
		return res;
	}
}
