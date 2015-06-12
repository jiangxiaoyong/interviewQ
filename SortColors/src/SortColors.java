import java.util.LinkedList;
import java.util.List;


public class SortColors {

    public void sortColors(int[] A) {
        
    	List<Integer> list0 = new LinkedList<Integer>();
    	List<Integer> list1 = new LinkedList<Integer>();
    	List<Integer> list2 = new LinkedList<Integer>();
    	
    	for(int i : A){
    		if(i == 0){
    			list0.add(i);
    		}
    		else if(i == 1){
    			list1.add(i);
    		}
    		else if(i == 2){
    			list2.add(i);
    		}
    	}
    	
    	list1.addAll(list2);
    	list0.addAll(list1);
    	
    	for(int i = 0; i< A.length; i++){
    		
    		A[i] = list0.get(i);
    	}
    	
    	for(int i : A){
    		System.out.println(i);
    	}
    	
    }
	
	public static void main(String[] args) {

		int[] colors = new int[]{1,2,2,0,0,1,1,0,2,1,1,0,};
		
		
		SortColors sc = new SortColors();
		sc.sortColors(colors);
		
	}

}
