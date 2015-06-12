
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        
    	if(nums.length == 0){
    		return -1;
    	}
    	
    	    	
    	return search(nums, 0, nums.length-1, target);
    }
	
    public int search(int[]nums, int left, int right, int target){
    	
    	int mid = (left + right) /2;
    	
    	if(right < left){ 
    		return left; //always less than current mid value, so return left value
    	}
    			
    	
    	if(nums[mid] == target){
    		return mid;
    	}
    	
    	if(target < nums[mid]){
    		return search(nums, left, mid-1, target); //search left
    	}
    	else if(target > nums[mid]){
    		return search(nums, mid + 1, right, target); //search right
    	}
    	
    	return -1;
    }
	
	public static void main(String[] args){
		
		int[] array = new int[]{1,3,5,7};
		
		SearchInsertPosition sip = new SearchInsertPosition();
		int i = sip.searchInsert(array,6);
		System.out.println(i);
	}
	
}
