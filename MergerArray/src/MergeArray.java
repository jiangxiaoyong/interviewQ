
public class MergeArray {

	
	public void merge(int[] a, int m, int[] b, int n){
		
		int[] result = new int[m + n];
		int lastIndex = m + n -1;
		int lastIndex_a = m-1;
		int lastIndex_b = n-1;
		
		if(m >n){
			while(lastIndex_a >=0 && lastIndex_b >=0){
				if(a[lastIndex_a] > b[lastIndex_b]){
					result[lastIndex] = a[lastIndex_a];
					lastIndex_a--;
				}
				else{
					result[lastIndex] = b[lastIndex_b];
					lastIndex_b--;
				}
				lastIndex--;
								
			}
			
			while(lastIndex_a >= 0){
				result[lastIndex] = a[lastIndex_a];
				lastIndex--;
				lastIndex_a--;
			}
		}
		
		for(int i: result){
			System.out.println(i);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] a1 = new int[]{1,2,3,4};
		int[] a2 = new int[]{5,6,7};
		
		MergeArray ma =  new MergeArray();
		ma.merge(a1, 4, a2, 3);
	}

}
