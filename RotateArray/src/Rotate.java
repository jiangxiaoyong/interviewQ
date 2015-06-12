
public class Rotate {

	public void rotate(int[] nums, int k){
		
        int times = k % nums.length;
		int []lastPart = new int[times];
		int []firstPart = new int[nums.length - times];
		
        for(int i = 0; i < times; i ++){
            lastPart[i] = nums[nums.length - times + i];    
        }
        
        for(int i = 0; i < nums.length-times; i++){
            firstPart[i] = nums[i];
        }
        System.arraycopy(lastPart, 0, nums,0, times);
        System.arraycopy(firstPart, 0, nums, times, nums.length-times); 
         
        
        for(int i = 0 ; i < nums.length; i++){
        	System.out.println(nums[i]);
        }
	}
	
	public static void main(String[] args) {

		int [] array = new int[]{1,2,3,4,5,6,7};
		Rotate r = new Rotate();
		r.rotate(array, 9);
		
	}

}
