package com.mtit.lab.last;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class EmployeeRef {

	public static void main(String[] args)throws Exception {
		Class<?> clazz = Class.forName("com.mtit.lab.last.Employee");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m: methods) {
			m.setAccessible(true);
			String output = "Modifier => ";
			output += Modifier.toString(m.getModifiers());
			output += " || Return Type => ";
			output += m.getReturnType();
			output += " || Method Name => ";
			output += m.getName();
			if (m.getParameterCount() > 0) {
				output += " || Method Paramters => ";
				for (Class<?> type: m.getParameterTypes()) {
					output += type.getSimpleName() + " ";
				}
			}
			System.out.println(output);
		}
	}
}
