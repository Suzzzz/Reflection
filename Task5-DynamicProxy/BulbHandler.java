package com.mtit.lab.last;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BulbHandler implements InvocationHandler {

	IBulb bulb;
	
	public BulbHandler(IBulb bulb) {
		this.bulb = bulb;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Bulb handler invoke " + method.getName());
		return method.invoke(bulb, args);
	}
}
