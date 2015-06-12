
public class ReverseStringII {
	
	public void reverse(String str){
		
		StringBuilder sb = new StringBuilder(str);
		String s = sb.reverse().toString();
		
		System.out.println(s);
	}

	public static void main(String[] args) {

		String str = "abcdefg";
		
		ReverseStringII rs = new ReverseStringII();
		rs.reverse(str);
		
	}

}
