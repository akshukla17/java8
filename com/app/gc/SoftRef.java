package com.app.gc;

import java.lang.ref.SoftReference;

public class SoftRef {
	public static void main(String[] args) {
		SoftRef a=new SoftRef();
		SoftReference<SoftRef> b=new SoftReference<SoftRef>(a);
		System.out.println(a.toString()+" soft "+b.toString());
		a=null;
		System.out.println(" soft "+b.toString());
	}

}
