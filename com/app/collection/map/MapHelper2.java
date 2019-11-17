package com.app.collection.map;

import java.util.Map;

public class MapHelper2 implements Runnable{

	Map<String,Integer> map;
	
	public MapHelper2(Map<String,Integer> map) {
		this.map = map;
		new Thread(this,"MapHelper2").start();
	}

	@Override
	public void run() {
		map.put("two", 2);
		try {
			System.out.println("MapHelper2 sleeping");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
