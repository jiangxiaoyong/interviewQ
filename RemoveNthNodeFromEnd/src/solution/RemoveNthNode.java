package solution;

public class RemoveNthNode {
	
    public Node removeNthFromEnd(Node head, int n) {
        
    	if(n == 0){
    		return head;
    	}
    	
    	Node end = head;
    	int counter = 0;
    	
    	//move pointer to end of list and count number of node
    	while(end.next != null){
    		end = end.next;
    		counter++;
    	}
    	
    	end = head;
    	/*
    	 * deal with corner cases
    	 */
    	int remain = counter - n ;
    	if(remain == -1){
    		if(head.next == null){
        		head = null;
        		return head;
    		}
    		else{
    			end = head.next;
    			return end;
    		}

    	}

    	for(int i = 0 ; i < remain; i ++){
    		end = end.next;
    	}
    	
    	end.next = end.next.next;
    	//end.next.next = null;
    	end = head;
    	
    	return head;
    }
	

	public static void main(String[] args) {

		Node list = new Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(5);
		
		RemoveNthNode rn = new RemoveNthNode();
		Node node = rn.removeNthFromEnd(list, 4);
		
		System.out.println(node.toString());
		
	}

}
