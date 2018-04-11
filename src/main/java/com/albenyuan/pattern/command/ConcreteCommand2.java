package com.albenyuan.pattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 09:15
 */
public class ConcreteCommand2 implements Command {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteCommand2.class);

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        logger.info("ConcreteCommand2.execute()");
        this.receiver.operate();
    }
}
