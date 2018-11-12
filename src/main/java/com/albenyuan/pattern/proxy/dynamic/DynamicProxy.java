package com.albenyuan.pattern.proxy.dynamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Alben Yuan
 * @Date 2018-11-12 10:55
 */
public class DynamicProxy implements InvocationHandler {
    private final static Logger logger = LoggerFactory.getLogger(DynamicProxy.class);

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.info("invoke: {}, method: {}", method.getDeclaringClass(), method.getName());
        return method.invoke(target, args);
    }


}
