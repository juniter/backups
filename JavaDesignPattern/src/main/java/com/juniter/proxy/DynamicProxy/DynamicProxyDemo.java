package com.juniter.proxy.DynamicProxy;

import com.juniter.proxy.StaticProxy.ProxyTargetInterface;
import com.juniter.proxy.StaticProxy.Traget;

/**
 * @author Juniter
 * ¶¯Ì¬´úÀí
 */
public class DynamicProxyDemo {
	public static void main(String args[]) {
		ProxyTargetInterface inter = (ProxyTargetInterface) new ProxyFactory(new Traget()).getProxyInstance();
		inter.action();
		inter.save();
		inter.ismvp(1);
	}
}
