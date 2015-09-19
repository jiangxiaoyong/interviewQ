import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class RemoveDup {

	public int removeDup(int[]A){
		
		//Solution 1
		
		List<Integer> list = new ArrayList<Integer>(A.length);
		for(int i: A){
			list.add(i);
		}
		
		Set<Integer> set = new HashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		
		Integer[] result = new Integer[list.size()];
		list.toArray(result);
		
		for(int i : result){
			System.out.println(i);
		}
		
		
		//Solution 2
		/*
		int prev = A[0];
		for(int i = 1; i < A.length; i++){
			if(prev == A[i]){
				System.arraycopy(A, i + 1, A, i, (A.length - (i+1)));
			}
			else{
				prev = A[i];
			}
		}
		
		for(int i : A){
			System.out.println(i);
		}
		*/

		return 0;
	}
	
	public static void main (String[]args){
		
		int[]A = new int[]{1,1,1,2};
		RemoveDup rd = new RemoveDup();
		rd.removeDup(A);
		
	}
}
