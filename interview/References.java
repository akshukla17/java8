package interview;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class References {

	public static void main(String[] args) {
		String s = new String("a");
		SoftReference<String> sRef = new SoftReference<String>(s); 
		WeakReference<String> weakRef = new WeakReference<String>(s);
//		PhantomReference<String> phantomRef = new PhantomReference<String>(String, s);
	}
}
