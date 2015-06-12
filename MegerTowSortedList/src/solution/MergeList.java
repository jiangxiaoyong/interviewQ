package solution;

public class MergeList {

    public Node mergeTwoLists(Node l1, Node l2) {

    	
    	
    	if(l1 == null && l2 != null){
    	    return l2;
    	}
    	else if(l2 == null && l1 != null){
    	    return l1;
    	}
    	else if(l1 == null && l2 == null){
    	    return null;
    	}
    
        
    	Node n1 = l1;
    	Node n2 = l2;
    	Node next = l1.next;
    	while(n1 != null && n2 != null){
    		
			if(n1.next == null){
				break;
			}
			
			if(n1.val > n2.val){
				Node temp = new Node(n2.val);
				temp.next = n1;
				n1 = temp;
				l1 = n1;
				
				n2 = n2.next;
			}
   			else if(n1.val <= n2.val && next.val >= n2.val){
    			Node temp = new Node(n2.val);
    			temp.next= n1.next;
    			n1.next = temp;
    			
    			n2 = n2.next;
    			n1 = n1.next;
    		}
    		else{
    			
    			n1 = n1.next;
    			next = n1.next;
			
    		}
    		
    	}
    	//l1 loop to end first
    	if(n1.next == null && n2 != null){
    		if(n1.val > n2.val){
    		while(n2 != null){
    			
    				Node temp = new Node(n2.val);
    				temp.next = n1;
    				n1 = temp;
    				l1 = n1;
    				
    				n2 = n2.next;
    			}
    		}
    		else{
        		n1.next = n2;

    		}
    	}
 	
    	return l1;
    }
	
	public static void main(String[] args) {
		
		Node list1 = new Node(2);


		
		Node list2 = new Node(1);


		
		MergeList ml = new MergeList();
		Node node = ml.mergeTwoLists(list1, list2);
		System.out.println(node.toString());
		
	}

}
