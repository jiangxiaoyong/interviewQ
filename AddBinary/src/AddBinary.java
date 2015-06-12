import java.util.ArrayList;
import java.util.List;


public class AddBinary {
	
	public String add(String s1, String s2){
		
		char temp = '0';
		int index_s1 = s1.length()-1;
		int index_s2 = s2.length()-1;
		
		String result ="";
		List<String> list = new ArrayList<String>();
		
		while(index_s1 >=0 || index_s2 >=0){
			char c1 ;
			char c2 ;
			if(index_s1 >= 0){
				c1 = s1.charAt(index_s1);
			}
			else{
				c1 = '0';
			}
			
			if(index_s2 >= 0){
				c2 = s2.charAt(index_s2);
			}
			else{
				c2 = '0';
			}
			
			if(temp == '0'){
				if(c1 == '1' && c2 == '1'){
					list.add("0");
					temp = '1';
				}
				else if (c1 == '0' && c2 == '0'){
					list.add("0");
					temp = '0';
				}
				else{
					list.add("1");
					temp = '0';
				}
			}
			else{
				if(c1 == '1' && c2 == '1'){
					list.add("1");
					temp = '1';
				}
				else if (c1 == '0' && c2 == '0'){
					list.add("1");
					temp = '0';
				}
				else{
					list.add("0");
					temp = '1';
				}
				
			}
			index_s1--;
			index_s2--;
		}
		
		if(temp == '1'){
			list.add("1");
		}
		
		for(String c : list){
			System.out.println(c);
			result += c;
		}
		
		StringBuilder sb = new StringBuilder(result);
		String num = sb.reverse().toString();
		
		return num;
	}

	public static void main(String[] args) {

		String str1 = "11";
		String str2 = "11";
		
		AddBinary ab = new AddBinary();
		String result = ab.add(str1, str2);
		System.out.println(result);
		
	}

}
