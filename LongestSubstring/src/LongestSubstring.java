import java.util.HashSet;
import java.util.Set;


public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
    
    	Set<Character> set = new HashSet<Character>();

    	int length = 0;
    	int max = Integer.MIN_VALUE;
    	for(int i = 0; i < s.length(); i++){
    		for(int j = i; j < s.length(); j++){
    			char c = s.charAt(j);
    			if(!set.contains(c)){
    				set.add(c);
    			}
    			else{
    				if(length > max){
        				length = set.size();
        				max = length;
    				}
    				set.clear();
    				break;
    			}
    		}
    	}
    	
    	return length;
    }
    
	public static void main(String[] args) {

		String str = "bbbbbb";
		LongestSubstring ls = new LongestSubstring();
		int i = ls.lengthOfLongestSubstring(str);
		System.out.println(i);
		
	}

}
