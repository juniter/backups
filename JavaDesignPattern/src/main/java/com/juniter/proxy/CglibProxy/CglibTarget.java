package com.juniter.proxy.CglibProxy;

public class CglibTarget {
	public void ask() {
		System.out.println("say hello");
	}

	public boolean respond(String greeting) {
		System.out.println(greeting);
		return false;
	}
}
