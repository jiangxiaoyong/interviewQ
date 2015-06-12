
public class MaxSubarray {

    public int maxSubArray(int[] nums) {
        
    	int max = Integer.MIN_VALUE;
    	int sum = 0;
    	
    	for(int i = 1 ; i < nums.length; i ++){ // grows of subarray
    		
    		int leftmost_start = nums.length - i;
    		
    		for(int j = 0; j <= leftmost_start; j++){
    			
    			for(int k = j; k <i + j ; k++){ //sum up element in subarray
    				sum += nums[k];
    				
    			}
    			
				if(sum > max){
					max = sum;
				}
    			sum = 0;
    		}
    		
    	}
    	return max;
    }
	
	public static void main(String[] args) {
		
		
		int array [] = new int[]{-2, 1,-3, 4, -1, 2,1,-5,4};
		MaxSubarray sub = new MaxSubarray();
		
		int i = sub.maxSubArray(array);
		System.out.println(i);
		
 	}

}
