
public class Compression {

	public String compress (String str){
		
		char lastCh = 0;
		int counter = 1;
		StringBuilder strb = new StringBuilder();
		for(char ch : str.toCharArray()){
			

			if(lastCh == ch){	
				counter ++;
				
			}
			else{
				
				if(lastCh != 0){
					strb.append(lastCh);
					strb.append(counter);			
					counter = 1;
				}
		
			}
			lastCh = ch;
			
		}
		
		strb.append(lastCh);
		strb.append(counter);
		return strb.toString();
	}
	
	public static void main(String[] args) {
		String str = "aabcccccaaaddc";
		Compression com = new Compression();
		System.out.println(com.compress(str));
	}

}
