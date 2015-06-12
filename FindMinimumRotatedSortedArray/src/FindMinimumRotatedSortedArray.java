import java.util.Arrays;


public class FindMinimumRotatedSortedArray {

    public int findMin(int[] nums) {
        
    	Arrays.sort(nums);
    	
    	return nums[0];
    	
    }
    
	
	public static void main(String[] args) {

		int[] a = new int[]{4,5,6,7,0,1,2};
		
		FindMinimumRotatedSortedArray find = new FindMinimumRotatedSortedArray();
		int i = find.findMin(a);
		System.out.println(i);
		
	}

}
