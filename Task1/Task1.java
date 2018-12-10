package com.mtit.lab.last;

import java.lang.reflect.Modifier;

public class Task1 {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("com.mtit.lab.last.Task1");
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getName());
			System.out.println(clazz.getPackage());
			System.out.println(clazz.getModifiers());
			System.out.println(Modifier.toString(clazz.getModifiers()));
			System.out.println(clazz.getDeclaredMethod("main", String[].class));
			System.out.println(clazz.getDeclaredMethod("main", String[].class).getModifiers());
			System.out.println(Modifier.toString(clazz.getDeclaredMethod("main", String[].class).getModifiers()));
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
