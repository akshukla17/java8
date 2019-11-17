package interview.leet.easy;

/**
 * in-place
 * 
 * @author Ajay
 *
 */
public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		int a[] = {1,1,2};//{ 1, 2, 2, 2, 4, 5, 6, 7, 7, 7 };//{1};//
		int len = remove(a);
		System.out.println("len: " + len);
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
	}

	
	private static int remove(int[] a) {
		int x=0,y=-1;
		for(int i=1;i<a.length;i++) {
				if(a[x] != a[i]) {
					x++;
					if(y !=-1)
						a[y]=a[i];
					y=x+1;
				}else {
					y=x+1;
				}
				
		}
		return x+1;
	}

	public static int removeDuplicatesLeet(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	private static int removeDuplicates(int[] a) {
		int k = 0;
		int low = -1;
		for (int i = 0; i < a.length - 1;) {
			k = i;
			while (k + 1 < a.length && a[i] == a[k + 1]) {
				a[k + 1] = Integer.MAX_VALUE;
				if(low == -1) low = k+1;
				k++;
			}
			i = k + 1;

		}
//		int low =0;
//		while (low< a.length && a[low] != Integer.MAX_VALUE) {
//			low++;
//		}
		if(low > -1) {
			for (int l = low + 1; l < a.length; l++) {
				if (a[l] != Integer.MAX_VALUE) {
					a[low] = a[l];
					a[l] = Integer.MAX_VALUE;
					low++;
				}
			}
			return low;
			
		}else {
			return a.length;
		}
	}
}
