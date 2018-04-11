package com.albenyuan.pattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 接收者可定义为接口或抽象类，有具体的实现类、子类完成不同的具体任务
 *
 * @Author Alben Yuan
 * @Date 2018-04-11 09:22
 */
public class Receiver {

    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    public void operate() {
        logger.info("Receiver.operate()");
    }

}
