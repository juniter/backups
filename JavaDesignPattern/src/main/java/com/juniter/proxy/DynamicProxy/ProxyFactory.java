package com.juniter.proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author Juniter ��̬���� -- ʵ�������ڵ��÷�����ʱ��̬�Ĳ�����ÿ�ε��÷�������ִ�з������÷���invoke������
 *         (proxy,method,params) --
 *         proxyΪ��ǰ�������ʵ����methodΪ��ǰ����������ִ�еķ�����parameters�ǵ�ǰ��������Ĳ���
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
