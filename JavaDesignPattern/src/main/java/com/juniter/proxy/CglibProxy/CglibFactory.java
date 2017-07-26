package com.juniter.proxy.CglibProxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;

public class CglibFactory implements MethodInterceptor {

	private Object target_;

	public CglibFactory(Object target) {
		this.target_ = target;
	}

	public Object getProxyInstance() {
		Enhancer en =new Enhancer();
		en.setSuperclass(target_.getClass());
		en.setCallback(this);
		return en.create();
	}
	@Override
	public Object invoke(MethodInvocation arguments) throws Throwable {
		return null;
	}

}
