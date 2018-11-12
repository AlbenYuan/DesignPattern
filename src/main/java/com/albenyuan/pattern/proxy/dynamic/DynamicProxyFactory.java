package com.albenyuan.pattern.proxy.dynamic;


import java.lang.reflect.Proxy;

/**
 * @Author Alben Yuan
 * @Date 2018-11-12 15:53
 */
public class DynamicProxyFactory<T> {

    private Class<T> interfaceClass;

    public DynamicProxyFactory(Class<T> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    public Object newInstance(DynamicProxy dynamicProxy) {
        return Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, dynamicProxy);
    }

    public Object newInstance(T target) {
        return newInstance(new DynamicProxy(target));
    }


}
