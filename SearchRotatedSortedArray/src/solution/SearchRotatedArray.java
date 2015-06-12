package solution;

public class SearchRotatedArray {

    public int search(int[] nums, int target) {
        
    	if(nums.length == 1){
    		if(target == nums[0]){
    			return 0;
    		}
    		else{
    			return -1;
    		}
    	}
    	
    	int i = Bsearch(nums, 0, nums.length , target);
    	
    	return i;
    }
    
    public int Bsearch(int[] nums, int left, int right, int target){
    	
    	if(left >= right){
    		return -1;
    	}
    	
    	int mid = (left + right) / 2;
    	
    	if(target == nums[mid]){
    		return mid;
    	}
    	
    	
    	if(nums[left] < nums[mid]){
    		
    		if(target >= nums[left] && target <= nums[mid]){
    			return Bsearch(nums, left, mid - 1, target); // search left
    		}
    		else{
    			return Bsearch(nums, mid + 1, right, target); //search right
    		}
    		
    	}
    	else if(nums[left] > nums[mid]){
    		
    		if(target >= nums[mid] && target <= nums[right]){
    			return Bsearch(nums, mid +1 ,right, target); //search right
    		}
    		else{
    			return Bsearch(nums, left, mid -1, target); // search left
    		}
    	}
    	else if(nums[left] == nums[mid]){
    		
    		if(nums[mid] != nums[right]){
    			return Bsearch (nums, mid + 1, right, target); //search right
    		}
    	}
    	
    	return -1;
    }
	
	public static void main(String[] args) {

		int[] array = new int[]{4,5,6,7,1,2,3};
		
		SearchRotatedArray s = new SearchRotatedArray();
		
		int i = s.search(array, 3);
		System.out.println(i);
		
	}

}
