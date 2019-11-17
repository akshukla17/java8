package interview.leet.easy;
/**
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.
 * 
 * Input: A = "ab", B = "ba"   >> Output: true

Input: A = "ab", B = "ab"   >> Output: false

Input: A = "aa", B = "aa" >>  Output: true
 * @author Ajay
 *
 */
public class BuddyStrings {

	public static void main(String[] args) {
		System.out.println(buddyStrings("ab","ba"));
	}
	
	 public static boolean buddyStrings(String A, String B) {
	        for(int i=0;i< B.length()-1;i++){
	            String s =B;
	            char c1= s.charAt(i);
	            char c2= s.charAt(i+1);
	            s =s.replace(s.charAt(i),c2);
	            s =s.replace(s.charAt(i+1),c1);
	            System.out.println(s+" >>>original: "+ B);
	            if(s.equals(B)){
	                return true;
	            }
	        }
	        return false;
	    }
}
