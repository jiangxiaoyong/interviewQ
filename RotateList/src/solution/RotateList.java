package solution;

import java.util.Stack;

public class RotateList {
	
    public Node rotateRight(Node head, int k) {
        
    	Node cur = head;
    	int counter = 0;
    	//count number of node
    	while(cur != null){
    		cur = cur.next;
    		counter ++;
    	}
    	
    	//actual move
    	int temp = k % counter;
    	int move = counter - temp;
    	cur = head;
    	Node mark = null;
    	Stack<Integer> stack = new Stack<Integer>();

    	for(int i = 0; i < counter; i++){
    		if(i < move){
    			mark = cur;
        		cur = cur.next;
    		}
    		else{
    			stack.push(cur.val);
    			cur = cur.next;
    		}
    	}
    	
    	mark.next = null;
    	
    	cur =  head;
    	for(int i =0; i < temp; i++){
    		int value = stack.pop();
    		Node node = new Node(value);
    		node.next = cur;
    		cur = node;
    		
    	}
    	
     	 
    	
    	return cur;
    }

	public static void main(String[] args) {
		
		Node list = new Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(5);
		list.appendToTail(6);
		list.appendToTail(7);
		
		RotateList rl = new RotateList();
		Node node = rl.rotateRight(list, 2);
		System.out.println(node.toString());
	}

}
