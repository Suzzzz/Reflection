package com.mtit.lab.last;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;


public class Task4AnnotationRef{

	public static void main(String[] args) throws Exception {
		Method m = 	new Task4TestAnnotation().getClass().getMethod("testcase1");
		Annotation[] ann = m.getAnnotations();
		for (Annotation a: ann) {
			Task4 t = (Task4) a;
			System.out.println("Priority: " + t.priority());
			System.out.println("Description: " + t.description());
			System.out.println("Groups: " + Arrays.toString(t.groups()));
			System.out.println("Depends On: " + Arrays.toString(t.dependsOnMethods()));
		}
	}
}
