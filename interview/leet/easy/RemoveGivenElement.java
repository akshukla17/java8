package interview.leet.easy;
/**
 * remove given element (in place)
 * @author AS52140
 *
 */
public class RemoveGivenElement {

	public static void main(String[] args) {
		int a [] = {3,2,4,3};//{2,5,3,3,3,3};
		int val =3;
		int len = removeElement(a, val);
		for(int i=0;i<len;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static int removeElement(int[] nums, int val) {
        if (nums.length < 1) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (val == nums[j]) {
                continue;
            }
            nums[i] = nums[j];
            i++;
        }
        return i;
    }
	
	private static int remove(int[] a, int val) {
		int c=0;
		int l =a.length;
		int i=0;
		for(;i<l;i++) {
			if(a[i] == val) {
				l =replace(a, i,l);
			}
		}
		return i ;
	}

	private static int  replace(int[] a, int i, int l) {
		for( ; i< l-1;i++) {
			a[i] = a[i+1];
		}
		return l-1;
	}
	
}
