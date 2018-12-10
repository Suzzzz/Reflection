package com.mtit.lab.last;

public class Task4TestAnnotation {
	
	@Task4(priority = 2, dependsOnMethods = {"testcase2", "testcase3"}, 
			description = "This represents annotation test case 1", 
			groups = {"com.mtit.lab.last"})
	public String testcase1() {
		return "Annotation test case 1";
	}

	@Task4(description = "This represents annotation test case 2", 
			groups = {"com.mtit.lab.last"})
	public String testcase2() {
		return "test case 2";
	}
	
	@Task4(description = "This represents annotation test case 3")
	public String testcase3() {
		return "test case 3";
	}

}
