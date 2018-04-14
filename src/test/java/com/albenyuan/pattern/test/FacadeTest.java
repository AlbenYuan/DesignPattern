package com.albenyuan.pattern.test;

import com.albenyuan.pattern.facade.Facade;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-14 21:04
 */
public class FacadeTest {

    @Test
    public void test() throws Exception {

        Facade facade = new Facade();
        facade.operation();
    }
}
