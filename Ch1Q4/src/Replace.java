
public class Replace {

	public String replace (String str){
		
		StringBuilder s = new StringBuilder();
		for	(char ch : str.toCharArray()){
			if(Character.isSpaceChar(ch)){
				s.append("%20");
			}
			else{
				s.append(ch);
			}
		}
		return s.toString();
	}
	
	public static void main(String[] args) {
		
		String str = " hello world    ";
		Replace rep = new Replace();
		System.out.println(rep.replace(str));
		
	}

}
