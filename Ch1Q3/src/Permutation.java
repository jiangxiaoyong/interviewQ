import java.util.Arrays;



public class Permutation {

	
	
	public boolean checkPermutation(String str1, String str2){
		
		
		boolean charArray[] = new boolean[256];
		
		//store existing character into boolean array for future comparision
		for	(char ch : str1.toCharArray()){
			int i =  ch;
			if(charArray[i] == false){
				charArray[i] = true;
			}
		}
		
		for	(char ch : str2.toCharArray()){
			int i = ch;
			if(charArray[i] == false){
				return true;
			}
		}
		return false;
	}
	
	public String sort(String str){
		char[] cha = str.toCharArray();
		Arrays.sort(cha);
		return new String(cha);
	}
	
	public boolean solution(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}

		return sort(str1).equals(sort(str2));
	}
	
	
	public static void main (String[] args){
		
		Permutation permutation = new Permutation();
		
		boolean check = permutation.checkPermutation("abc  ", "cba ");
		
		System.out.println(permutation.solution("abc", "bca"));
	}
}
