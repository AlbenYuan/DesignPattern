package com.albenyuan.pattern.test;

import com.albenyuan.pattern.decorator.Component;
import com.albenyuan.pattern.decorator.ConcreteComponent;
import com.albenyuan.pattern.decorator.ConcreteDecorator1;
import com.albenyuan.pattern.decorator.ConcreteDecorator2;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 17:17
 */

public class DecoratorTest {


    @Test
    public void test() throws Exception {

        ConcreteComponent concreteComponent = new ConcreteComponent();
        Component component = null;
        component = new ConcreteDecorator1(concreteComponent);
        component.method();
        component = new ConcreteDecorator2(concreteComponent);
        component.method();
    }
}
