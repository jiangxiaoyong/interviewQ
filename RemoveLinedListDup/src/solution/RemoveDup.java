package solution;

public class RemoveDup {
	
    public Node deleteDuplicates(Node head) {
    	
    	if(head.next == null){
    		return null;
    	}
    	
    	Node cur = head.next;
    	Node prev = head;
    	int value = head.val;
    	
    	while (cur != null){
    		
    		if(cur.val == value){
    			prev.next = cur.next;
    			cur = cur.next;
    		}
    		else{
    			value = cur.val;
    			prev = cur;
    			cur = cur.next;
    		}
    	}
        return head;
    }

	public static void main(String[] args) {
		Node list = new Node(1);
		list.appendToTail(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(3);

		RemoveDup rd = new RemoveDup();
		Node node = rd.deleteDuplicates(list);
		System.out.println(node.toString());
	}

}
