package com.mtit.lab.last;

import java.lang.reflect.Proxy;

public class Task5 {

	public static void main(String[] args) {
		IBulb bulb = new BulbImpl();
		ClassLoader cloader = IBulb.class.getClassLoader();
		IBulb ibulb = (IBulb) Proxy.newProxyInstance(cloader, new Class[] {IBulb.class}, new BulbHandler(bulb));
		
		ibulb.on();
		ibulb.off();
	}
}
