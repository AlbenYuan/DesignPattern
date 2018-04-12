package com.albenyuan.pattern.test;

import com.albenyuan.pattern.responsibility.ConcreteHandler1;
import com.albenyuan.pattern.responsibility.ConcreteHandler2;
import com.albenyuan.pattern.responsibility.Handler;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-12 10:44
 */
public class ResponsibilityTest {

    @Test
    public void test() throws Exception {
        
        Handler handler = new ConcreteHandler1();
        handler.setHandler(new ConcreteHandler2());

        handler.action();
    }
}
