package remove;

public class Node {

	int data;
	Node next;
	
	public Node (int d){
		data = d;
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
	    String result = n.data + " ";
	    if (n.next != null) {
	        result += n.next.toString();
	    }
	    return result;
	}

	
}
