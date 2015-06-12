package solution;

public class Node {
	int val;
	Node next;
	
	public Node(){
		
	}
	
	public Node (int d){
		val = d;
	}
	
	public void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;


		while(n.next != null){
			n = n.next;
		}
		
		n.next = end;
	
		

	}
	
	public String toString() {
		
		Node n = this;
	    String result = n.val + " ";
	    if (n.next != null) {
	        result += n.next.toString();
	    }
	    return result;
	}
}
