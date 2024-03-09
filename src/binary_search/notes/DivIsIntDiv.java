package binary_search.notes;

/*
	Given a function f(x) = x + x/10 + + ... 
	Note : the division is integer division. 
	Examples: 
	1. f(1234) = 1234 + 123 + 12 +1 = 1370 
	2. f(214) = 214 +21 237 
	3. f(50) = 50 +5 55 
	4. f(8) = 8 
*/

public class DivIsIntDiv {

	public int sumNo(int no) {
		int ans = no;
		while(no > 0) {
			no = no/10;
			ans = ans + no;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		DivIsIntDiv obj = new DivIsIntDiv();
		System.out.println("Sum : "+obj.sumNo(214));
	}
	
}
