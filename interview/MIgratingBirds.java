package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MIgratingBirds {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};//{1,4,5,7,4,4,6};
		List<Integer> arr = new ArrayList<>();
		for(Integer i: a) {
			arr.add(i);
		}
		int result = migratoryBirds(arr);
		System.out.println(result);
	}
	
	static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i: arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        int key =Integer.MAX_VALUE, value=1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
           int k = entry.getKey();
           int v = entry.getValue();
           if(value < v) {
        	   key =k;
        	   value=v;
           }else if(value == v) {
        	   if(key > k) {
        		   key =k;
        	   }
           }
        }
        return value > 1 ? key: -1;
    }
}
