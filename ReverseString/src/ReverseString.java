import java.util.Stack;


public class ReverseString {

    public String reverseWords(String s) {
        
        String result = "";
        if(s.isEmpty()){
            return result;
        }
        
        
        String delimiter = "[ ]+";
        String newStr = s.trim();
    	String[] strs = newStr.split(delimiter);
    	Stack<String> stack = new Stack<String>();
    	
    	if(strs.length==1){
    	    result = newStr;
    	    return result;
    	}
    	for(String str : strs){
    		stack.push(str);
    	}
    	
    	int size = stack.size();
    	for(int i = 0 ; i < size -1; i++){
    		result += stack.pop() + " ";
    	}
    	
    	result += stack.pop();
    	
    	return result;
    }
	
	public static void main(String[] args) {

		String str = "   a   b ";
		ReverseString rs = new ReverseString();
		String result = rs.reverseWords(str);
		System.out.println(result);
		
	}

}
