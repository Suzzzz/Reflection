//package com.mtit.lab.last;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class BookRef {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("BookRef");
		Field[] fields = clazz.getDeclaredFields();
		Object obj = clazz.newInstance();
		
		System.out.print(fields[0].getName() + " = ");
		fields[0].setAccessible(true);
		System.out.println(fields[0].get(obj));
		
		System.out.print(fields[1].getName() + " = ");
		System.out.println(fields[1].get(obj));
		
		System.out.print(fields[2].getName() + " = ");
		String[] arr = (String[]) fields[2].get(obj);
		System.out.println(Arrays.toString(arr));
		
		System.out.print(fields[3].getName() + " = ");
		fields[3].setDouble(obj, 2187.5);
		System.out.println(fields[3].get(obj));
		
		// System.out.println();
		// for (Field f: fields) {
		// 	System.out.print(f.getName() + " = ");
		// 	f.setAccessible(true);
		// 	System.out.println(f.get(obj));
		// }
	}
}
