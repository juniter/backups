package com.juniter.proxy.StaticProxy;

/**
 * @author Juniter
 *
 * ��̬����
 * 	
 * 	ȱ��
 * 		1.��Ϊ��Ŀ�����ʵ�ֵķ���һ��,���Խӿڸ���ʱ��Ӱ��porxy �� targer class,���߶���Ҫά��
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
