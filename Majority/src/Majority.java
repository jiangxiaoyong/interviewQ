import java.util.HashMap;
import java.util.Map;


public class Majority {

	public void find (int[]a ){
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i : a){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}
			else{
				map.put(i, 0);
			}
		}
		
		int max = Integer.MIN_VALUE;
		int max_key = 0;
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if(value > max){
				max_key = key.intValue();
				max = value;
			}
		}
		System.out.println(max_key);
	}
	
	public static void main(String[] args) {

		int[] a = new int[]{1,1,1,1,2,2,3,4,5,5,5,5,5,5,5,5};
		
		Majority mj = new Majority();
		mj.find(a);
	}

}
