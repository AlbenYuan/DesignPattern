package com.albenyuan.pattern.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-21 11:50
 */
public class ConcreteColleague extends Colleague {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action1() {
        logger.info("ConcreteColleague.action1()");
    }

    @Override
    public void action2() {
        logger.info("ConcreteColleague.action2()");
        super.mediator.action();
        super.mediator.operation();

    }
}
