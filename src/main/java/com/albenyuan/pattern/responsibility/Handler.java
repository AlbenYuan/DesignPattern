package com.albenyuan.pattern.responsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-12 10:26
 */
public abstract class Handler {

    private static Logger logger = LoggerFactory.getLogger(ConcreteHandler1.class);

    protected Handler handler;
    
    public void action() {
        logger.info("Handler.action()");
        Handler next = this.getNextHandler();
        if (null != next) {
            next.action();
        }
    }

    public void setHandler(Handler handler) {
        logger.info("Handler.setHandler()");
        this.handler = handler;
    }

    /**
     * 可重写获取下一个控制器的方法
     *
     * @return
     */
    protected Handler getNextHandler() {
        logger.info("Handler.getNextHandler()");
        return handler;
    }
}
