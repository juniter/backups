package com.juniter.proxy;

import org.junit.Test;

import com.juniter.proxy.StaticProxy.StaticProxyDemo;
import com.juniter.proxy.StaticProxy.Proxy;
import com.juniter.proxy.StaticProxy.ProxyTargetInterface;
import com.juniter.proxy.StaticProxy.Traget;

public class ApplicationStartupTest {

	@Test
	public void testExe() {
		ProxyTargetInterface proxy = new Proxy(new Traget());
		StaticProxyDemo startup =new StaticProxyDemo();
		startup.setProxy(proxy);
		startup.exe();
	}
}
