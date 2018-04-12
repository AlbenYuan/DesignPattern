package com.albenyuan.pattern.test;

import com.albenyuan.pattern.template.AbstractClass;
import com.albenyuan.pattern.template.ConcreteClass;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-12 09:28
 */
public class TemplateTest {

    @Test
    public void test() throws Exception {
        AbstractClass template = new ConcreteClass();
        template.action();
    }
}
