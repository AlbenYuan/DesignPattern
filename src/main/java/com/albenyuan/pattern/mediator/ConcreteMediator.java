package com.albenyuan.pattern.mediator;

/**
 * @Author Alben Yuan
 * @Date 2018-04-21 11:46
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void action() {
        super.colleague.action1();
    }

    @Override
    public void operation() {
        super.colleague.action1();

    }
}
