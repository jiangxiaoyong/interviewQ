package remove;

import java.util.HashSet;
import java.util.Set;


public class Duplicate {
	
	public void removeDup(Node n){
		
		Set<Integer> hs = new HashSet<Integer>();
		Node prev = null;
		while(n.next != null){
			if(hs.contains(n.data)){
				//remove duplicate
				prev.next = n.next; 
			}
			else{
				hs.add(n.data);
				prev = n;
			}
			n = n.next;
		}
		
		//remove last duplicated elemenet
		if(hs.contains(n.data)){
			//remove duplicate
			prev.next = null; 
		}
	}

	public static void main(String[] args) {

		Node n = new Node(2);
		n.appendToTail(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(3);
		System.out.println(n.toString());
		
		
		Duplicate dup = new Duplicate();
		dup.removeDup(n);
		
		System.out.println(n.toString());
		
	}

}
