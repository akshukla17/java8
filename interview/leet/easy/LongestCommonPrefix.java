package interview.leet.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String [] a={"flower","flow","flight"};//{"dog","racecar","car"};// 
		System.out.println(longestCommonPrefix(a));
	}
	
	public static String longestCommonPrefix(String[] strs) {
	     String pre="";
	      if(strs.length <=0) return ""; 
	        String start =strs[0];
	        int k=0;
	        int count =1;
	        int i=0, n=Integer.MAX_VALUE;
	        while(i< strs.length) {
	        	if(n > strs[i].length()) {
	        		n= strs[i].length();
	        		k=i;
	        	}
	        	i++;
	        }
	        int j=0;
	        start = strs[k];
	        while(j<n) {
	        	count =0;
	        	for(int x=0;x<strs.length;x++) {
	        		if(strs[x].charAt(j) == start.charAt(j)) {
	        			count++;
	        		}else {
	        			break;
	        		}
	        	}
	        	if(count == strs.length) {
	        		pre = pre+start.charAt(j);
	        		j++;
	        	}else {
	        		return pre;
	        	}
	        }
	        return pre;
//	        while(1==1) {
//	        	for(int i=1;i<strs.length;i++){
//	 	           
//		            if(k< strs[i].length()){
//		                if(start.charAt(k) == strs[i].charAt(k)){
//		                    count++;
//		                }else{
//		                    if(count == strs.length){
//		                        pre= pre+start.charAt(k);
//		                         count =1;
//		                         k++;
//		                    }else {
//		                    	return pre;
//		                    }
//		                }
//		            }else{
//		            	 if(count == strs.length){
//		                        pre= pre+start.charAt(k);
//		                         count =1;
//		                         k++;
//		                    }
//		                return pre;
//		            }
//		            
//		        }
//	        	if(count == strs.length){
//                    pre= pre+start.charAt(k);
//                     count =1;
//                     k++;
//                }
//	        }
	        
	    }
}

