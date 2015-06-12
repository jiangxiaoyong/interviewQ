
public class LengthLastWord {

	public int length(String str){
		
		String delimiters = "[ ]+";
		String[] s = str.split(delimiters);
		String temp = "";
		for(String string : s){
			temp = string;
		}
		
		return temp.length();
	}
	
	public static void main(String[] args) {

		String str = "Hellow world  ni hao";
		LengthLastWord llw = new LengthLastWord();
		
		int length = llw.length(str);
		System.out.println(length);
	}

}
