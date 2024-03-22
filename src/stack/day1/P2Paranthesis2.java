package stack.day1;
import java.util.ArrayList;
import java.util.Stack;

public class P2Paranthesis2 {
	
}

// 20. Valid Parentheses :-   https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> track = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ele = s.charAt(i);
            if(ele=='[' || ele=='{' || ele=='(')
                track.push(ele);

            else{ 
                //If entering element is closing bracket, then it will not push in stack & stack remains empty
                if(track.empty()) return false;

                //char peekEle = track.peek();
                else if((ele==')' && track.peek()=='(') || (ele==']' && track.peek()=='[') || (ele=='}' && track.peek()=='{'))
                    track.pop();

                else
                    return false; //it's closin bracket but not matching the prev then false
            }
        }

        //If all the closing brackets matches then stack become empty otherwise it contain any bracket
        return track.empty();
    }
}