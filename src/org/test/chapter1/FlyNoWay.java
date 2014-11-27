package org.test.chapter1;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I ain't gonna fly...");
	}
}
