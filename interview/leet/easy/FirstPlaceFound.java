package interview.leet.easy;

public class FirstPlaceFound {

	public static void main(String[] args) {
		String s = "mississippi";//"hello";// "aaa";
		String n = "issipi";//"lo";// 
		System.out.println(strStr(s, n));

	}

	 public static int strStrLeet(String haystack, String needle) {
	        int needleLen = needle.length() - 1;
	        int hayLen = haystack.length();
	        for (int i = 0; i + needleLen < hayLen; i++) {
	            if (haystack.substring(i, i+needleLen+1).equals(needle))
	                return i;
	        }
	        return -1;
	    }
	 
	public static int strStr(String sec, String first) {
		int k = 0, start = -1;
		
		if(first.length() > sec.length()) return -1;
		
		for(int i=0;i<sec.length();i++) {
			if(k < first.length() &&  first.charAt(k) == sec.charAt(i)) {
				k++;
				if(start == -1) start =i;
				
			}else {
				if(k == first.length()) return start;
				if(start !=-1)
					i=start;
				start =-1;
				k=0;
			}
		}
		
		return k ==first.length() ?start: -1;
	}
}
