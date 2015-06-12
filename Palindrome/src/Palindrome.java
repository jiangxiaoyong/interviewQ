import java.util.Stack;


public class Palindrome {

	public boolean checkPalindrome(String str){
		
		Stack<Character> stack = new Stack<Character>();
		
		//determine total number of alphanumeric
		int counter = 0;
		for(char c : str.toCharArray()){
			if(Character.isDigit(c)||Character.isLetter(c)){
				counter ++;
			}
		}
		System.out.println(counter);
		boolean odd = (counter%2 != 0) ? true : false;
		int mid = (odd == true) ? counter/2 : (counter/2)-1;

		counter = 0;
		for(char c : str.toCharArray()){			
			//push into stack
			if((Character.isDigit(c)||Character.isLetter(c))&&counter <=mid){
				if(odd == true && counter != mid){
					stack.push(c);
				}
				else if(odd == false ){
					stack.push(c);
				}
				
				counter++;
			}
			else if(Character.isDigit(c)||Character.isLetter(c)){
				char c_stack = stack.pop().charValue();
				if(Character.toLowerCase(c) != Character.toLowerCase(c_stack)){
					return false;
				}
			}
			
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {

		String str = "A man, a plan, a canal: Panama";
		Palindrome pal = new Palindrome();
		
		boolean result = pal.checkPalindrome(str);
		System.out.println(result);
	}

}
