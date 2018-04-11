package com.albenyuan.pattern.iterator;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 17:16
 */
public interface Aggregate<E> {

    void add(E e);

    void remove(E e);

    Iterator<E> iterator();

}
