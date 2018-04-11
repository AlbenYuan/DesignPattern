package com.albenyuan.pattern.test;

import com.albenyuan.pattern.state.Context;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 16:34
 */
public class StateTest {


    @Test
    public void test() throws Exception {

        Context context = new Context();

        context.setValue(null);

        context.handle();
        context.setValue("value");
        context.handle();
    }
}
