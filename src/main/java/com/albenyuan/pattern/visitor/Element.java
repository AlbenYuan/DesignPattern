package com.albenyuan.pattern.visitor;

/**
 * @Author Alben Yuan
 * @Date 2018-04-26 14:30
 */
public interface Element {

    void accept(Visitor visitor);

}
