package interview.leet.easy;

public class StringBinaryAddition {

	public static void main(String[] args) {
		String a ="1110110101";
		String b="1110111011";
		//exected: "11101110000"
		System.out.println(a);
		System.out.println(b);
		String c = binarySum(a,b);
		System.out.println(c);
		int x[] = {1,2,6,7,7};
		int y[] = {5,7,8,2,3};
//		System.out.println(sum(x,y));
	}
	private static int sum(int a[], int b[]) {
		int res=0;
		int la = a.length-1;
		int lb = b.length-1;
		int c =0, carry =0;
		int base = 10;
		int multi=1;
		while(la >=0 && lb >=0) {
			c = a[la]+b[lb]+carry;
			if(c>=base) {
				carry = c/base;
				c = c%base;
			}else {
				carry=0;
			}
			res = res+c*multi;
			multi *=base;
			la--;
			lb--;
		}
		
		// la <=0 
		while(la >=0) {
			c = a[la]+carry;
			if(c >base) {
				carry = c/base;
				c = c%base;
			}
			res = res*base+c;
			carry=0;
			la--;
		}
		
		// lb >=0
		while(lb >=0) {
			c = b[lb]+carry;
			if(c >base) {
				carry = c/base;
				c = c%base;
			}
			res = res*base+c;
			carry=0;
			lb--;
		}
		
		return res;
	}

	private static String binarySum(String a, String b) {
		String res="";
		int i=a.length()-1,j=b.length()-1;
		int aa, bb;
		int cc, carry=0;
		int multi=1;
		int base = 2;
		while(i>=0 && j >=0) {
			aa= Integer.parseInt(a.charAt(i)+"");
			bb = Integer.parseInt(b.charAt(j)+"");
			cc= aa+bb+carry;
			if(cc >1) {
				carry=cc/base;
				cc=cc%base;
			}else {
				carry =0;
			}
			if(cc !=0)
				res =res+cc*multi;
			multi *=10;
			i--;
			j--;
		}
		while(i>=0) {
			cc= Integer.parseInt(a.charAt(i)+"");
			cc +=carry;
			if(cc > 1) {
				carry=cc/base;
				cc=cc%base;
			}else {
				carry=0;
			}
			res= res+cc*multi;
			multi *=10;
			i--;
		}
		while(j >=0) {
			cc= Integer.parseInt(b.charAt(j)+"");
			cc +=carry;
			if(cc > 1) {
				carry=cc/base;
				cc=cc%base;
			}else {
				carry=0;
			}
			res= res+cc*multi;
			multi *=10;
			j--;
		}
		if(carry >0) {
			res = res+carry*multi;
		}
		return res+"";
	}
}
