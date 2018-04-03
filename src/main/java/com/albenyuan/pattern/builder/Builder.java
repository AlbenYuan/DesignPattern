package com.albenyuan.pattern.builder;

/**
 * @Author albenyuan
 * @Date 2017-11-16 23:42
 * <p>
 * 抽象创建者：给出抽象接口，用以规范产品对象的各个组成成分的创建
 */

public interface Builder {

    void produceComponent();

    void assemble();

    void installOS();

    Phone receive();
}
