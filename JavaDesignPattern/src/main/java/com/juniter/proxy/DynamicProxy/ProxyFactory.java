package com.juniter.proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author Juniter 动态代理 -- 实际上在在调用方法的时候动态的操作，每次调用方法都会执行方法调用方法invoke处理器
 *         (proxy,method,params) --
 *         proxy为当前代理类的实例，method为当前代理类正在执行的方法，parameters是当前方法传入的参数
 */
public class ProxyFactory {
	private Object target_;

	public ProxyFactory(Object target) {
		this.target_ = target;
	}

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target_.getClass().getClassLoader(), target_.getClass().getInterfaces(),
				(proxy, method, params) -> {
					return method.invoke(target_, params);
				});
	}
}
