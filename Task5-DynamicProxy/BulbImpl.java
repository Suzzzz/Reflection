package com.mtit.lab.last;

public class BulbImpl implements IBulb{

	@Override
	public void on() {
		System.out.println("Light on");
	}
	
	@Override
	public void off() {
		System.out.println("Light off");
	}
}
