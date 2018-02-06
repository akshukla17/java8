import java.util.*;
public class UniqueCharacter{
	public static void main(String []a){
		String s="ABCAD";
		System.out.println("is given string contains unique characters:: "+unique(s));
	}
	private static boolean unique(String s){
		boolean isUnique=true;
		if(s==null) return false;
		
		Map<Character,Integer> map=null;
				
		for(int i=0;i<s.length();i++){
			if(map==null){
				map=new HashMap<>();
			}else if(map.containsKey(s.charAt(i))){
				isUnique=false;
				break;
			}else{
				map.put(s.charAt(i),1);
			}
		}
		System.out.println(map);
		return isUnique;
	}
}