package interview.leet.easy;

public class RepeatedSubString_459 {

	public static void main(String[] args) {
		String s ="aba";//"babbabbabbabbab";// "abababababab";
		System.out.println(repeatedSubstringPattern(s));
	}

	public static boolean repeatedSubstringPattern(String s) {
		String sub = "";
		String res="";
		int n = s.length();
		for (int i = 0; i < s.length(); i++) {
			sub = s.substring(0, n-i-1);
			
			if (sub.length() > 0) {
				res=sub;
				while (res.length() < s.length()) {
					res += sub;
				}
				if (res.length() == s.length() && res.equals(s)) {
					return true;
				}else {
					res="";
				}
			}
		}
		return false;
	}
}
