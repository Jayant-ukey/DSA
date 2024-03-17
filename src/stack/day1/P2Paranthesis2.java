package stack.day1;
import java.util.ArrayList;

public class P2Paranthesis2 {
	
	int i,j;
	ArrayList<Character> arr;
	
	P2Paranthesis2(){
		i=0;
		j=0;
		arr= new ArrayList<>();
	}
	
	/*
	 * void checkParanthesis(String str) {
	 * 
	 * 
	 * }
	 */
	
	void push(char ch) {
		arr.add(ch);
		i++;
	}
	
	void pop() {
//		System.out.println("popped"+i);
		i--;
	}
	
	char top() {
		j=i-1;
//		System.out.println("popped ele"+arr.get(j));
		return arr.get(j);
	}
	
	public static void main(String[] args) {
		String par = "{}[]()";
		char checkTop = 'a';
		boolean check = true;
		
		P2Paranthesis2 p = new P2Paranthesis2();
		for(int i=0; i<par.length(); i++) {
			if(par.charAt(i)=='(' || par.charAt(i)=='[' || par.charAt(i)=='{') {
				System.out.println("Push : "+par.charAt(i));
				p.push(par.charAt(i));
			}
			
			else {
				checkTop = p.top();
				System.out.println("Popped : "+checkTop);
				if(par.charAt(i)==')' && checkTop=='(') p.pop();
				else if(par.charAt(i)==']' && checkTop=='[') p.pop();
				else if(par.charAt(i)=='}' && checkTop=='{') p.pop();
				else {
					check = false;
					break;
				}
			}
			System.out.println(check);
		}
//		System.out.println(check);

		
//		System.out.println(checkParanthesis(par));
	}
}
