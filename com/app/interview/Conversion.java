import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Conversion{
	public static void main(String []args){
		int[] arr={1,2,4,23,12,5};
		//int[] to Integer[] array converison
		Integer[] wrapper=Arrays.stream(arr).boxed().toArray(Integer[]::new);
		for(int i=0;i<wrapper.length;i++){
			System.out.print(wrapper[i]+" ");
		}
		// int [] to List array
		List<Integer> ls=Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println("");
		System.out.print(ls);
		
	}
}