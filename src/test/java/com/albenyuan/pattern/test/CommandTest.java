package com.albenyuan.pattern.test;

import com.albenyuan.pattern.command.ConcreteCommand1;
import com.albenyuan.pattern.command.ConcreteCommand2;
import com.albenyuan.pattern.command.Invoker;
import com.albenyuan.pattern.command.Receiver;
import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 09:20
 */
public class CommandTest {

    @Test
    public void test() throws Exception {

        Receiver receiver = new Receiver();
        ConcreteCommand1 concreteCommand1 = new ConcreteCommand1(receiver);

        ConcreteCommand2 concreteCommand2 = new ConcreteCommand2(receiver);

        Invoker invoker = new Invoker();
        invoker.addCommand(concreteCommand1);
        invoker.addCommand(concreteCommand2);
        invoker.action();
    }
}
