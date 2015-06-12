import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i : numbers){
    		list.add(i);
    	}
    	
    	int [] result = new int[2];
    	for(int i = 0; i < numbers.length; i++){
    		int remain = target - numbers[i];
    		int index1 = i;
    		int index2 = 0;
    		
    		if(list.contains(remain)){
    			index2 =  list.indexOf(remain);
    			if(index1 < index2){
        			result[0] = index1;
        			result[1] = index2;
    			}

    		}
    	}
    		  	
    	return result;
    }
	
	public static void main(String[] args) {
		int[] num = new int[]{2,11,15,7};
		TwoSum ts = new TwoSum();
		int[] result = ts.twoSum(num, 9);
		System.out.println(Arrays.toString(result));
	}

}
