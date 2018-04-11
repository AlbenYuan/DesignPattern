package com.albenyuan.pattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 09:14
 */
public class ConcreteCommand1 implements Command {
    private static final Logger logger = LoggerFactory.getLogger(ConcreteCommand1.class);


    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        logger.info("ConcreteCommand1.execute()");
        this.receiver.operate();
    }
}
