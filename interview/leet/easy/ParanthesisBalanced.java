package interview.leet.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParanthesisBalanced {

	public static void main(String[] args) {
		

	}
	
	 public boolean isValid(String s) {
	        
	        Map<Character,Character> map = new HashMap<>();
	        map.put('{','}');
	        map.put('(',')');
	        map.put('[',']');
	        Stack<Character> stack = new Stack<>();
	        for(int i=0;i<s.length();i++){
	            char c=s.charAt(i);
	            if(map.containsKey(c)){
	                stack.add(c);
	            }else{
	                if(!stack.isEmpty()){
	                    char peekKey = stack.peek();
	                    char val = map.get(peekKey);
	                     if(val == c){
	                         stack.pop();
	                     }else{
	                         return false;
	                     }
	                }else{
	                    return false;
	                }
	                
	            }
	        }
	        if(stack.isEmpty()){
	            return true;
	        }else{
	            return false;
	        }
	    }
}
