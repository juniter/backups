package com.juniter.proxy.StaticProxy;

/**
 * @author Juniter
 *
 * 静态代理
 * 	
 * 	缺点
 * 		1.因为与目标对象实现的方法一致,所以接口更改时会影响porxy 和 targer class,两者都需要维护
 */
public class StaticProxyDemo {
	private ProxyTargetInterface proxy;
	public void exe() {
		proxy.action();
	}
	public void setProxy(ProxyTargetInterface proxy) {
		this.proxy = proxy;
	}
}
