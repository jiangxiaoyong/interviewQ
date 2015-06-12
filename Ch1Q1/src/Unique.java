import java.util.ArrayList;
import java.util.List;

public class Unique {
	
	
	public boolean checkUnique(String str){
		boolean check = false;
	
		//check length of string
		if(str.length() > 256){
			return true;
		}
		
		for (int i = 0; i < str.length(); i++)
		{
			int k;
			k = str.charAt(i);
			System.out.println(k);
		}
		
		List<Character> list = new ArrayList<Character>();
		for (char ch : str.toCharArray()){
						
			for (char ch1: list){
				if (ch1 == ch) {
					return true;
				}
					
			}
			list.add(ch);		
		}
		
		return false;
	}

	
	public static void main(String[] args) {


		String str = "abcdefgggg";
		Unique unique = new Unique();
		boolean check = false;
		check =	unique.checkUnique(str);
		System.out.println(check);
	}

}
