package solution;

public class RemoveLinkedListElement {
	
    public Node removeElements(Node head, int val) {
        
    	Node cur= head;
    	Node prev = cur;
    	while(cur != null){
    		 if(cur.val == val){
    			 prev.next = cur.next;
    			 if(cur == head && cur.next == null){
    				 head = null;
    			 }
    			 else if(cur == head){
    				 head = cur.next;
    				 cur = head;
    				 prev = cur;
    			 }
    			 else{
        			 cur = cur.next;

    			 }
    		 }
    		 else{
        		 prev = cur;
        		 cur = cur.next;
    		 }
    		 
    	}
    	
    	return head;
    }

	public static void main(String[] args) {
		Node list = new Node(1);
		list.appendToTail(2);
		list.appendToTail(6);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(5);
		list.appendToTail(6);

		
		RemoveLinkedListElement re = new RemoveLinkedListElement();
		Node node = re.removeElements(list, 1);
		System.out.println(node.toString());
	}

}
