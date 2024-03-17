package stack.day1;

public class P2Paranthesis {
	
	static boolean checkParanthesis(String str) {
		
		int open=0, close=0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == ')') 
				close++;

			else
				open++;	
			
			if(close>open)
				return false;
		}
		
		if(close != open)
			return false;
		
		else
			return true;
	}
	
	public static void main(String[] args) {
		String par = ")()";
		
		System.out.println(checkParanthesis(par));
	}

}
