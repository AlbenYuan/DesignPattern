package com.albenyuan.pattern.test;

import com.albenyuan.pattern.proxy.Proxy;
import com.albenyuan.pattern.proxy.Subject;
import com.albenyuan.pattern.proxy.dynamic.DynamicProxy;
import com.albenyuan.pattern.proxy.dynamic.DynamicProxyFactory;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-03 13:52
 */

public class ProxyTest {

    @Test
    public void proxy() {
        Proxy proxy = new Proxy();
        proxy.action();
    }

    @Test
    public void dynamicProxy() throws Exception {

        DynamicProxyFactory factory = new DynamicProxyFactory(Subject.class);

        Class clazz = Class.forName("com.albenyuan.pattern.proxy.RealSubject");
        Subject subject = (Subject) factory.newInstance(clazz.newInstance());

        subject.action();
    }
}
