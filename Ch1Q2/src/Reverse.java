
public class Reverse {

	public String swap(String str){
		
		char[] c = str.toCharArray();
		
		for (int i = 0 ; i < str.length()/2; i++){
			char temp;
			temp = c[i];
			c[i] = c[str.length() - 1 - i];
			c[str.length() - 1 -i] = temp;
		}
		
		return new String(c);
	}
	
	public static void main(String[] args){
		String str = "abcde";
		
		Reverse r = new Reverse();
		String s = r.swap(str);
		System.out.println(s);
	}
	
}
