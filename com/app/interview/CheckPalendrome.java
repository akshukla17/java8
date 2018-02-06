public class CheckPalendrome{
	// check given string is palendrome or not
		public static void main(String []args){
			String s=args[0].trim();
			System.out.println("Given string >>  "+s+" >> is palendrome: "+checkPalendrome(s));
		}
		public static boolean checkPalendrome(String s){
			int l=s.length();
			boolean isPalendrome=false;
			for(int i=0;i<=l/2;i++){
				//System.out.println(" 1 "+s.charAt(i)+" 2 "+s.charAt(l-1-i)+" boolean "+isPalendrome);
				
				if(s.charAt(i)!=s.charAt(l-1-i)){
					isPalendrome=false;
					break;
				}else{
					isPalendrome=true;
				}
				
			}
			return isPalendrome;
		}
}