import java.util.HashMap;
import java.util.Map;


public class SingleNum {

    public int singleNumber(int[] A) {
     
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i : A){
    		if(!map.containsKey(i)){
    			map.put(i, 1);
    		}
    		else{
    			map.put(i, map.get(i) + 1);
    		}
    	}
    	
    	int result =0;
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    		int key = entry.getKey().intValue();
    		int value = entry.getValue().intValue();
    		if(value == 1){
    			result = key;
    		}
    	}
    	return result;
    }
	public static void main(String[] args) {
		int []	num = new int[]{1,2,1,2,3,3,4,5,5,6,6,7,7};
		SingleNum sn = new SingleNum();
		int r = sn.singleNumber(num);
		System.out.println(r);
	}

}
