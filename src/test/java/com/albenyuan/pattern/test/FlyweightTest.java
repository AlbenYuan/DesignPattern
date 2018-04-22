package com.albenyuan.pattern.test;

import com.albenyuan.pattern.flyweight.ConcreteFlyweightFactory;
import com.albenyuan.pattern.flyweight.Flyweight;
import com.albenyuan.pattern.flyweight.FlyweightFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-22 15:23
 */
public class FlyweightTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void name() throws Exception {
        FlyweightFactory flyweightFactory = new ConcreteFlyweightFactory();

        logger.info("1:{}", flyweightFactory.getFlyweight("1"));
        logger.info("1:{}", flyweightFactory.getFlyweight("1"));
        logger.info("2:{}", flyweightFactory.getFlyweight("2"));
    }
}
