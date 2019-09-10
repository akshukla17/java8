package interview.leet.easy;

public class ReverseNumber {

	public static void main(String[] args) {
		int i= 1534236469;
		System.out.println(reverse(i));
	}
	
	 public static int reverse(int x) {
	        int sign = 1;
	        int base =10;
	        if(x < 0){
	          sign =-1;
	            x = x*-1;
	        } 
	        int rev =0;
	        while(x > 0){
	            if(rev > Integer.MAX_VALUE/10){
	                return 0;
	            }
	            rev = rev*10+ x%base;
	            x /=10;
	        }
	        
	        return rev*sign;
	    }
}
