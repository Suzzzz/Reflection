package com.mtit.lab.last;

import java.lang.reflect.Method;

public class Task3 {

	public static void main(String[] args) throws Exception {
		executeMethod();
	}
	
	public static void executeMethod() throws Exception {
		Employee emp = new Employee();
		Class[] paramter = new Class[4];
		paramter[0] = String.class;
		paramter[1] = String.class;
		paramter[2] = String.class;
		paramter[3] = Double.TYPE;
		
		Method m = emp.getClass().getMethod("display", paramter);
		//Method m = emp.getClass().getMethod("display", String.class, String.class, String.class, Double.TYPE);
		System.out.println((String) m.invoke(emp, "1", "asd", "zxc", 123.123));
	}
}
