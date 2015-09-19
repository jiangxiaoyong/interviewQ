import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class RemoveDupII {

	/*
    public int removeDuplicates(int[] nums) {
        
    	Map<Integer, List<Integer>> map = new LinkedHashMap<Integer, List<Integer>>();
    	
    	for(int i: nums){
    		
    		if(!map.containsKey(i)){
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(i);
    			map.put(i, list);
    			
    		}
    		else if(map.containsKey(i) && map.get(i).size() < 2){
    			List<Integer> list = map.get(i);
    			list.add(i);
    		}
    	}
    	
    	List<Integer> arraylist = new ArrayList<Integer>();
    	for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
    		List<Integer> list = entry.getValue();
    		for(int i: list){
    			arraylist.add(i);
    		}
    	}
    	
    	for(int i: arraylist){
    		System.out.println(i);
    	}

    	return arraylist.size();
    }
    */
	
	public int removeDuplicates(int[] array){
		
		Map<Integer, ArrayList<Integer>> hashmap = new LinkedHashMap<Integer, ArrayList<Integer>>();
		for(int i : array){
			
			if(!hashmap.containsKey(i)){
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				hashmap.put(i, (ArrayList<Integer>) list);
			}
			else{
				if(hashmap.get(i).size() < 2){
					hashmap.get(i).add(i);
				}
			}
				
		}
		
		for(Entry<Integer, ArrayList<Integer>> entry : hashmap.entrySet()){
			List<Integer> list = entry.getValue();
			for(int i : list){
				System.out.println(i);
			}
		}
		
		for(int i = 0; i < 5; i++){
			
			for(int j = 0; j < 5; j++){
				if(j == i){
					System.out.print("x");
				}
				else if ( j == 5 -1 -i){
					System.out.print("x");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
		
		return 0;
	}
	
	public static void main(String[] args){
		
		int [] array = new int[]{1,1,1,2,2,3,3,3,3,4};
		RemoveDupII rdii = new RemoveDupII();
		int i = rdii.removeDuplicates(array);
		System.out.println(i);
		
	}
	
}
