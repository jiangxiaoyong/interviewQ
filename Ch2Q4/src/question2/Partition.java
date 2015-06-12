package question2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Partition {
	
	public List<Integer> partition(Node n, int value){
		
		List<Integer> small = new LinkedList<Integer>();
		List<Integer> big = new LinkedList<Integer>();
		while (n != null){
			int data = n.data;
			if(data < value){
				small.add(data);
			}
			else{
				big.add(data);
			}
			
			n = n.next;
		}
		
		small.addAll(big);
		
		return small;
	}

	public static void main(String[] args) {

		Node n = new Node(2);
		n.appendToTail(7);
		n.appendToTail(1);
		n.appendToTail(5);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(6);
		System.out.println(n.toString());
		
		Partition p = new Partition();
		List<Integer> list = p.partition(n, 4);
		System.out.println(Arrays.toString(list.toArray()));
		
	}

}
