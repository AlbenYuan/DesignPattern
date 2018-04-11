package com.albenyuan.pattern.test;

import com.albenyuan.pattern.iterator.Aggregate;
import com.albenyuan.pattern.iterator.ConcreteAggregate;
import com.albenyuan.pattern.iterator.Iterator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 17:23
 */
public class IteratorTest {

    private static Logger logger = LoggerFactory.getLogger(IteratorTest.class);

    @Test
    public void test() throws Exception {

        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            logger.info("s={}", s);
        }
    }
}
