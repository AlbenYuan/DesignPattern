package com.albenyuan.pattern.builder;

/**
 * @Author albenyuan
 * @Date 2017-11-16 23:52
 * 导演者：指导建造者，构建整个商品
 */

public class Director {

    public void construct() {
        Builder builder = new ConcreteBuilder();
        builder.produceComponent();
        builder.assemble();
        builder.installOS();
        Phone phone = builder.receive();
    }
}
