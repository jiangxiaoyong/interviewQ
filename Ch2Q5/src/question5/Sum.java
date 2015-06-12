package question5;


public class Sum {
	
	public Node summation (Node n1, Node n2){
		
		String num1_rev = "";
		String num2_rev = "";
		
		while(n1 != null){
			num1_rev += String.valueOf(n1.data);
			n1 = n1.next;
		}
		
		while(n2 != null){
			num2_rev += String.valueOf(n2.data);
			n2 = n2.next;
		}
		
		StringBuilder sb1 = new StringBuilder(num1_rev);
		StringBuilder sb2 = new StringBuilder(num2_rev);
		
		int realN1 = Integer.parseInt(sb1.reverse().toString());
		int realN2 = Integer.parseInt(sb2.reverse().toString());
		
		int sum = realN1 + realN2;
		String result = new StringBuilder(String.valueOf(sum)).reverse().toString();
		
		Node new_result = new Node();
		for	(char ch : result.toCharArray()){
			new_result.appendToTail(Character.getNumericValue(ch));
		}
		
		
		System.out.println(new_result.toString());
		
		return new_result;
	}

	public static void main(String[] args) {

		Node number1 = new Node(3);
		number1.appendToTail(2);
		number1.appendToTail(1);
		
		Node number2 = new Node(6);
		number2.appendToTail(5);
		number2.appendToTail(4);
		
		Sum s = new Sum();
		Node list = s.summation(number1, number2);
		
		System.out.println(list.toString());
		
	}

}
