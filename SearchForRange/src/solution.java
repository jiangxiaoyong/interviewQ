
public class solution {

    public int[] searchRange(int[] nums, int target) {
        
    	
    	
    	int[] result = Bsearch(nums, 0, nums.length, target);
    	
    	return result;
    }
    
    public int[] Bsearch(int[] a, int left, int right, int target){
    	
    	if(left >= right){
    		return new int[]{-1, -1};
    	}
    	
    	
    	int mid = (left + right) / 2;
    	if(a[mid] == target){
    		return new int[mid -1, mid + 1];
    	}
    	
    	if(a[mid] < target)
    	
    	
    	
    	return null;
    }
	
	public static void main(String[] args) {

		int[] a = new int[]{3,5,6,7,9,10};
		
		solution s = new solution();
		s.searchRange(a, 9);
		
	}

}
