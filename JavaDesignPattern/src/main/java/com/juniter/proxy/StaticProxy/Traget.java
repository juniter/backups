package com.juniter.proxy.StaticProxy;

public class Traget implements ProxyTargetInterface {

	@Override
	public void action() {
		System.out.println("Target Class Execute It's Method!");
	}

	@Override
	public void save() {
		System.out.println("Target Class Execute It's Save() Method!");
	}

	@Override
	public boolean ismvp(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
}
