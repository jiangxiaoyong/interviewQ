import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Anagrams{

    public List<String> anagrams(String[] strs) {
        
    	HashMap<String, List<String>> map = new HashMap<String, List<String>>();
    	List<String> list_result = new ArrayList<String>();
    	if(strs.length == 0){
    		return list_result;
    	}
    	
    	for(String str : strs){
    		char[] c = str.toCharArray();
    		Arrays.sort(c);
    		String key = new String(c);
    		
    		if(map.containsKey(key)){
    			List<String> list = map.get(key);
    			list.add(str);
    		}
    		else{
    			List<String> list = new ArrayList<String>();
    			list.add(str);
    			map.put(key, list);
    		}
    	}
    	
    	
    	for(Map.Entry <String, List<String>> entry : map.entrySet()){
    		String key = entry.getKey();
    		List<String> list_temp = map.get(key);
    		for(String str : list_temp){
    			list_result.add(str);
    		}
    	}
    	

    	
    	return list_result;
    }
	
	public static void main(String[] args) {

		String[] strings = new String[]{"anger", "bill","kernel", "lenrek","illb","ergan"};
		Anagrams an = new Anagrams();
		List<String> list = an.anagrams(strings);
		for(String str: list){
			System.out.println(str);
		}
	}

}
