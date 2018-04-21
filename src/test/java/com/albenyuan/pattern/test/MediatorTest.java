package com.albenyuan.pattern.test;

import com.albenyuan.pattern.mediator.Colleague;
import com.albenyuan.pattern.mediator.ConcreteColleague;
import com.albenyuan.pattern.mediator.ConcreteMediator;
import com.albenyuan.pattern.mediator.Mediator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-21 11:53
 */
public class MediatorTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void name() throws Exception {

        Mediator mediator = new ConcreteMediator();
//        mediator.s

        Colleague colleague = new ConcreteColleague(mediator);
        mediator.setColleague(colleague);

        colleague.action1();
        logger.info("");
        colleague.action2();
    }
}
