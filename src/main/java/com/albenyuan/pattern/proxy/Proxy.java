package com.albenyuan.pattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 代理模式中的代理类，使用真实主题封装主题的业务逻辑。
 *
 * @Author Alben Yuan
 * @Date 2018-04-03 10:50
 */
public class Proxy implements Subject {
    private static final Logger logger = LoggerFactory.getLogger(Proxy.class);

    private Subject subject;

    public Proxy() {
        logger.info("init Proxy，并设置真实主题");
        subject = new RealSubject();

    }

    @Override
    public void action() {
        logger.info("proxy action");
        subject.action();
    }
}
