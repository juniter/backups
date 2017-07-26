package com.juniter.proxy.StaticProxy;

public class Proxy implements ProxyTargetInterface {

	private Traget target_;

	public Proxy(Traget target) {
		this.target_ = target;
	}

	@Override
	public void action() {
		System.out.println("Proxy Class Execute Action() Method Itself");
		target_.action();
	}

	@Override
	public void save() {
		
	}

	@Override
	public boolean ismvp(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
